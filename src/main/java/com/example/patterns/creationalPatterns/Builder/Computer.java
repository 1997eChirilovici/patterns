package com.example.patterns.creationalPatterns.Builder;

public class Computer {

    private String HDD;
    private String SDD;
    private String RAM;
    private String graphicCard;

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public String getSDD() {
        return SDD;
    }

    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.SDD = builder.SDD;
        this.RAM = builder.RAM;
        this.graphicCard = builder.graphicCard;
    }

    //Builder Class
    public static class ComputerBuilder {

        private String HDD;
        private String SDD;
        private String RAM;
        private String graphicCard;

        public ComputerBuilder setHDD(final String HDD) {
            this.HDD = HDD;
            return this;
        }

        public ComputerBuilder setRAM(final String RAM) {
            this.RAM = RAM;
            return this;
        }

        public ComputerBuilder setGraphicCard(final String graphicCard) {
            this.graphicCard = graphicCard;
            return this;
        }

        public ComputerBuilder setSDD(final String SDD) {
            this.SDD = SDD;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

    }

    @Override
    public String toString() {
        return "Computer{" + "HDD='" + HDD + '\'' + ", SDD='" + SDD + '\'' + ", RAM='" + RAM + '\'' +
               ", graphicCard='" + graphicCard + '\'' + '}';
    }

}