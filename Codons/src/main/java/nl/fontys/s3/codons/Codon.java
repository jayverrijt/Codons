package nl.fontys.s3.codons;

public class Codon {
    private final Nucleotide first;
    private final Nucleotide second;
    private final Nucleotide third;

    public Codon(Nucleotide first, Nucleotide second, Nucleotide third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public Codon(char first, char second, char third) {
        this(
                Nucleotide.valueOf(String.valueOf(first)),
                Nucleotide.valueOf(String.valueOf(second)),
                Nucleotide.valueOf(String.valueOf(third))
        );
    }

    public Codon(String nucleatides) {
        this (nucleatides.charAt(0), nucleatides.charAt(1), nucleatides.charAt(2));
    }


    public Nucleotide getFirst() {
        return first;

    }
    public Nucleotide getSecond() {
        return second;
    }

    public Nucleotide getThird() {
        return third;
    }
    @Override
    public String toString() {
        return "" + first + second + third;
    }
}
