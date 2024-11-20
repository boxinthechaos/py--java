public class Java_study07 {
    public static class Movie{
        String title;
        String director;
        int rating;
        int viewers;
        public Movie(String title, String director, int rating, int viewers){
            this.director = director;
            this.title = title;
            this.rating =rating;
            this.viewers = viewers;
        }
        public int add_viewers(int count){
            viewers += count;
            return viewers;
        }
        public String update_rating(int new_rating){
            if(new_rating < 1 || new_rating>5){
                return "잘못된 평점 입니다";
            }
            else{
                rating = new_rating;
                return "현재 평점"+this.rating;
            }
        }
        public void display_info(){
            System.out.println(title);
            System.out.println(director);
            System.out.println(rating);
            System.out.println(viewers);
        }
    }

    public static void main(String[] args) {
        Movie movie = new Movie("너의 이름은","신카이 마코토",0,0);
        movie.add_viewers(10000);
        movie.update_rating(5);
        movie.display_info();
    }
}
