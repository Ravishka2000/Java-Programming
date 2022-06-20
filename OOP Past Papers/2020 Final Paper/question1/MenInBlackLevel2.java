package question4;

public class MenInBlackLevel2 extends MenInBlack{

    public MenInBlackLevel2(AlienPack alienPack) {
        super(alienPack);
    }

    @Override
    public void kill() {

        int random;

        for (Alien alien : alienPack.alien){
            score += alien.getScore();
            random = (int) (Math.random()*10);
            if(random%2 == 1){
                score -= 2;
            }
        }
    }
}
