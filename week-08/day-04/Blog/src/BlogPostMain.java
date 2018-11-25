public class BlogPostMain {
  public static void main(String[] args) {
    BlogPost blogSpot01 = new BlogPost("Lorem Ipsum", "John Doe", "2000.05.04", "Lorem ipsum dolor sit amet.");
    BlogPost blogSpot02 = new BlogPost("Wait but why", "Tim Urban", "2010.05.04", "A popular long-form, stick-figure-illustrated blog about almost everything.");
    BlogPost blogSpot03 = new BlogPost("One Engineer Is Trying to Get IBM to Reckon With Trump", "William Turton", "2017.03.28.", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.");

    Blog myFistBlog = new Blog();
    myFistBlog.add(blogSpot01);
    myFistBlog.add(blogSpot02);
    myFistBlog.add(blogSpot03);

    System.out.println(myFistBlog);
    System.out.println();
    myFistBlog.delete(1);
    System.out.println(myFistBlog);
    System.out.println();

    BlogPost addaNewPost = new BlogPost("Java For Dummies", "Kovács-Posta Erika", "2018.11.25", "This is a new chapter of my Java programming language tutorial");
    myFistBlog.update(0, addaNewPost);
    System.out.println(myFistBlog);

  }
}

