package dodatkowe;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if(walk.length != 10) {
            return false;
        }

        int nortSouth = 0;
        int westEast = 0;

        for (char direction: walk) {
            switch (direction) {
                case 's': {
                    nortSouth++;
                    break;
                }
                case 'n': {
                    nortSouth--;
                    break;
                }
                case 'e': {
                    westEast++;
                    break;
                }
                case 'w': {
                    westEast--;
                    break;
                }
                default:{
                    return false;
                }
            }

        }
        if((nortSouth == 0) && (westEast == 0)) {
            return true;
        }
        return false;
    }
}
