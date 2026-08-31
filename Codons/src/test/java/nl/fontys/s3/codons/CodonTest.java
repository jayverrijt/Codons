package nl.fontys.s3.codons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CodonTest {
    @Test
    void toString_shouldReturnCodonNucleotideSequenceAsString() {
        Codon codon = new Codon(Nucleotide.T, Nucleotide.C, Nucleotide.G);
        String actual = codon.toString();
        assertEquals("TCG", actual);
    }

    @Test
    void getters_shouldReturnCorrectNucleotides() {
        Codon codon = new Codon(Nucleotide.A, Nucleotide.T, Nucleotide.C);

        assertEquals(Nucleotide.A, codon.getFirst());
        assertEquals(Nucleotide.T, codon.getSecond());
        assertEquals(Nucleotide.C, codon.getThird());


    }
}