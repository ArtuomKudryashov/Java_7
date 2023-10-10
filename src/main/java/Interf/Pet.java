package Interf;

public class Pet implements IName{

    private  final  String kind;

    private final String name;

    public Pet(String kind, String name) {
        this.kind = kind;
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    @Override
    public String getName() {
        return name;
    }
}
