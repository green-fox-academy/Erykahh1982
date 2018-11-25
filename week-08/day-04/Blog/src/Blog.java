import java.util.ArrayList;

public class Blog {
  private ArrayList<BlogPost> blogList;

  public Blog() {
    this.blogList = new ArrayList<>();
  }

  public void add(BlogPost post){
    this.blogList.add(post);
  }

  public void delete(int indexNumber){
    this.blogList.remove(blogList.get(indexNumber));
  }

  public void update(int indexNumber, BlogPost blog){
    this.blogList.set(indexNumber, blog);
  }

  public void display() {
    for (int i = 0; i < blogList.size() ; i++) {
      System.out.println(blogList.toString());
    }
  }

  public ArrayList getBlogPosts() {
    return blogList;
  }

  public void setBlogPosts(ArrayList blogPosts) {
    this.blogList = blogPosts;
  }

  @Override
  public String toString() {
    return "Blog{" +
        "blogList=" + blogList +
        '}';
  }
}
