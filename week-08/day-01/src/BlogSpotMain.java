public class BlogSpotMain {
  public static void main(String[] args) {
    BlogSpot blogSpot01 = new BlogSpot("Lorem Ipsum", "John Doe", "2000.05.04", "Lorem ipsum dolor sit amet.");
    BlogSpot blogSpot02 = new BlogSpot("Wait but why", "Tim Urban", "2010.05.04", "A popular long-form, stick-figure-illustrated blog about almost everything.");
    BlogSpot blogSpot03 = new BlogSpot("One Engineer Is Trying to Get IBM to Reckon With Trump", "William Turton", "2017.03.28.", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.");

    System.out.println(blogSpot01.toString());
    System.out.println(blogSpot02.toString());
    System.out.println(blogSpot03.toString());
  }
}
