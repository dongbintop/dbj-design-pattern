package create.build;

public interface ParlourBuilder extends Builder<ParlourBuilder, Parlour> {

    ParlourBuilder wall(String wall);

    ParlourBuilder TV(String TV);

    ParlourBuilder sofa(String sofa);
}
