package create.build;

public class Parlour {

    //墙
    private String wall;
    //电视
    private String TV;
    //沙发
    private String sofa;

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getTV() {
        return TV;
    }

    public void setTV(String TV) {
        this.TV = TV;
    }

    public String getSofa() {
        return sofa;
    }

    public void setSofa(String sofa) {
        this.sofa = sofa;
    }

    @Override
    public String toString() {
        return "wall:" + this.getWall() +
                ",TV:" + this.getTV() +
                ",sofa:" + this.getSofa();
    }


    public static class Builder implements ParlourBuilder {

        private Parlour parlour;

        public Builder() {
            this.parlour = new Parlour();
        }

        @Override
        public ParlourBuilder wall(String wall) {
            parlour.setWall(wall);
            return this;
        }

        @Override
        public ParlourBuilder TV(String TV) {
            parlour.setTV(TV);
            return this;
        }

        @Override
        public ParlourBuilder sofa(String sofa) {
            parlour.setSofa(sofa);
            return this;
        }


        @Override
        public Parlour build() {
            return parlour;
        }

        @Override
        public ParlourBuilder from(Parlour in) {
            if (in != null) {
                this.parlour = in;
            }
            return this;
        }
    }
}
