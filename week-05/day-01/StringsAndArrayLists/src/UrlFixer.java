public class UrlFixer {

    public static void main(String[] args) {


        String url = "https//www.reddit.com/r/nevertellmethebots";
        System.out.println("Original URL :" + url );

        String url2 = "https://www.reddit.com/r/nevertellmetheodds/";
        System.out.println("URL to be : " + url2);
        lines();
        //issue: ":" is missing after https; change "bots" to "odds"

        System.out.println("URL fix with .replace method: ");
        String urlNew = url.replace("bots", "odds");
        System.out.println("URL fix 1 : " + urlNew);

        String urlNew2 = urlNew.replace("https", "https:");
        System.out.println("URL fix 2 : " + urlNew2);

        lines();
        System.out.println("URL fix solution with .sub-string method: ");
        String substring1 = "https";
        String substring2 = "//www.reddit.com/r/nevertellmethebots";
        String substirng3 = ":";
        substring1.concat(substirng3);
        System.out.println(substring1 + substirng3 + substring2);
        lines();
    }

    static void lines() {
        for (int i = 0; i < 1 ; i++) {
            System.out.print("-----------------------------");
            System.out.println();
        }
    }
}
