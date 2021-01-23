package StreamAssignment;

import java.util.Arrays;
import java.util.List;

public class News {

	private int newsId;
	private String postedByUser;
	private String commentByUser; 
	private String comment;
	
	
	
	
	public int getNewsId() {
		return newsId;
	}




	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}




	public String getPostedByUser() {
		return postedByUser;
	}




	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}




	public String getCommentByUser() {
		return commentByUser;
	}




	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}




	public String getComment() {
		return comment;
	}




	public void setComment(String comment) {
		this.comment = comment;
	}




	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}




	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser
				+ ", comment=" + comment + "]";
	}




	public static void main(String[] args) {
		
		List<News> news = Arrays.asList(
				new News(1, "John", "very impressive", "a lot"),
				new News(2, "Amy", "I am so tired", "Agree"),
				new News(3, "Ana", "today is a rainy day, I want to sleep", "go ahead"),
				new News(2, "Amy", "I love my family", "for sure")
				);
		
		
		//Q4. Find out the newsId which has received maximum comments. 
		
		
		//Q5. Find out how many times the word 'budget' arrived in user comments all news.
		

		
		//Q6. Find out which user has posted maximum comments.
		
		
		//Q7. Display commentByUser wise number of comments.
//what is wise number//?????????????????????????
		
	}

}
