public class BlogPost {
  private String authorName;
  private String title;
  private String publicationDate;
  private String text;

  BlogPost() {
  }

  BlogPost(String title, String authorName, String publicationDate, String text) {
    this.authorName = authorName;
    this.publicationDate = publicationDate;
    this.title = title;
    this.text = text;
  }

  public String getAuthorName() {
    return authorName;
  }

  public String getTitle() {
    return title;
  }

  public String getPublicationDate() {
    return publicationDate;
  }

  public String getText() {
    return text;
  }

  @Override
  public String toString() {
    return authorName + " | " + title + " | " + publicationDate + " | " + text ;
  }
}
