package project1;

import java.util.*;
class Video {
	Video(String a){
		this.title = a;
	}
		
	String title;
	boolean isChecked = true;
	double rating = 0;
	void beingChecked() {
		this.isChecked = false;
	}
	void beingReturned() {
		this.isChecked = true;
	}
	void setRating(int r) {
		if(r>=0&&r<=5) {
			this.rating = r;
		}
	}
}	
class VideoStore{	
	
	void addVideo(String videoName) {
		Video v1 = new Video(videoName);
		VideoStoreLauncher.l[VideoStoreLauncher.no] = v1;
		(VideoStoreLauncher.no)++;
	}
	void checkOut(String videoName) {
		for(int i = 0;i<VideoStoreLauncher.no;i++) {
			if(videoName.equals(VideoStoreLauncher.l[i].title)) {
				if(VideoStoreLauncher.l[i].isChecked==true) {
				VideoStoreLauncher.l[i].isChecked = false;
				}
				else {
					System.out.println("not available");
				}
				
			}
			else {
				System.out.println("video not found");
		
			}
		}
		
		}
	void returnVideo(String videoName) {
		for(int i = 0;i<VideoStoreLauncher.no;i++) {
			if(videoName.equals(VideoStoreLauncher.l[i].title)) {
				VideoStoreLauncher.l[i].isChecked = true;
				
			}
		}
	}
	void receiveRating(String videoName, int rating) {
		for(int i = 0;i<VideoStoreLauncher.no;i++) {
			if(videoName.equals(VideoStoreLauncher.l[i].title)) {
				VideoStoreLauncher.l[i].setRating(rating);
				
			}
		}
	}
	void listInventory() {
		if(VideoStoreLauncher.no==0) {
			System.out.println("Inventory is empty");
		}
		else {
			for(int i = 0;i<VideoStoreLauncher.no;i++) {
				System.out.println("Name "+VideoStoreLauncher.l[i].title+" Rating "+VideoStoreLauncher.l[i].rating+" which is checked "+VideoStoreLauncher.l[i].isChecked);
			}
		}
	}
	
}

 public class VideoStoreLauncher{
	 public static Video[] l = new Video[10];
	 public static int no = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int rating;
		VideoStore TSERIES = new VideoStore();
		while(true) {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("###############################3");
		System.out.println("What you want to do");
		System.out.println("Enter 1 to view inventory");
		System.out.println("Enter 2 to add a video inventory");
		System.out.println("Enter 3 to check out a video");
		System.out.println("Enter 4 to return a video");
		System.out.println("Enter 5 to rate a video");
		System.out.println("Exit 0");
		Scanner enter = new Scanner(System.in);
		int inputed = enter.nextInt();
		if(inputed==1) {
			TSERIES.listInventory();
		}
		if(inputed==2) {
			System.out.println("Enter name of video you wanna add");
			enter.nextLine();
			name = enter.nextLine();
//			code of adding video
			TSERIES.addVideo(name);
		}
		if(inputed==3) {
//			checkout code
			System.out.println("enter the name of video to b checked out :");
			enter.nextLine();
			name = enter.nextLine();
			TSERIES.checkOut(name);
		}
		if(inputed==4) {
			System.out.println("enter the name of video to b return out :");
			enter.nextLine();
			name = enter.nextLine();
			TSERIES.returnVideo(name);
			name= "";
//		return code			
		}
		if(inputed==5) {
			System.out.println("Enter name of video");
			enter.nextLine();
			name = enter.nextLine();
			System.out.println("Enter rating of "+name);
			rating =enter.nextInt();
			TSERIES.receiveRating(name, rating);
			name = "";
			rating = 0;
		}
		if(inputed==0) {
			break;
		}

		}
	}
}
