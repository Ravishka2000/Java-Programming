package question4;

public class MenInBlack {
    int score;
    AlienPack alienPack;

    public MenInBlack(AlienPack alienPack) {
        this.score = 0;
        this.alienPack = alienPack;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void kill(){
        for (Alien alien : alienPack.alien){
            score += alien.getScore();
        }
    }
}
