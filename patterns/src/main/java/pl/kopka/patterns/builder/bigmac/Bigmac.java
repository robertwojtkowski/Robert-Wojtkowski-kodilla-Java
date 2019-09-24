package pl.kopka.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private String bun;
    private int burgers;
    private String sauce;
    private List<String> ingridients;

    static class BigmacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingridients = new ArrayList<>();

        private List<String> availableIngriedients;
        private List<String> availableBun;
        private List<String> availableSauce;
        private int maxBurgers;


        public BigmacBuilder(List<String> availableIngriedients, List<String> availableBun,
                             List<String> availableSauce, int maxBurgers) {
            this.availableIngriedients = availableIngriedients;
            this.availableBun = availableBun;
            this.availableSauce = availableSauce;
            this.maxBurgers = maxBurgers;
        }

        public BigmacBuilder bun(String bun) throws BigmacException{
            if(availableBun.contains(bun)){
                this.bun = bun;
            } else {
                throw new BigmacException();
            }
            return this;
        }

        public BigmacBuilder burgers (int burgers) throws BigmacException{
            if(maxBurgers > burgers){
                this.burgers = burgers;
            } else {
                throw new BigmacException();
            }
            return this;
        }

        public BigmacBuilder sauce (String sauce) throws BigmacException{
            if(availableSauce.contains(sauce)){
                this.sauce =sauce;
            } else {
                throw new BigmacException();
            }
            return this;
        }

        public BigmacBuilder ingridients (String ingridient) throws BigmacException{
            if(availableIngriedients.contains(ingridient)){
                this.ingridients.add(ingridient);
            } else {
                throw new BigmacException();
            }
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce,ingridients);
        }


    }

    private Bigmac(String bun, int burgers, String sauce, List<String> ingridients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingridients = ingridients;
    }

    public String getBun() {
        return bun;
    }

    public void setBun(String bun) {
        this.bun = bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public void setBurgers(int burgers) {
        this.burgers = burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public List<String> getIngridients() {
        return ingridients;
    }

    public void setIngridients(List<String> ingridients) {
        this.ingridients = ingridients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingridients=" + ingridients +
                '}';
    }
}
