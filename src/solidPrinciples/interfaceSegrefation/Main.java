package solidPrinciples.interfaceSegrefation;

interface ICoffeeShop {
    void brewFilterCoffee();
}

interface TraditionalShop {
    void brewByEspressoMachine();
    void brewMachinePourOver();
}

interface ThirdWavePourOver {
    void brewByHandHeldEspressoMaker();
    void brewManualPourOver();
}

class ThirdWave implements ICoffeeShop, ThirdWavePourOver {

    @Override
    public void brewFilterCoffee() {

    }

    @Override
    public void brewByHandHeldEspressoMaker() {

    }

    @Override
    public void brewManualPourOver() {

    }
}

class Traditional implements ICoffeeShop, TraditionalShop {

    @Override
    public void brewFilterCoffee() {

    }

    @Override
    public void brewByEspressoMachine() {

    }

    @Override
    public void brewMachinePourOver() {

    }
}

public class Main {

}
