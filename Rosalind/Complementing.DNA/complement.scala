object complement {
    def main(args: Array[String]) {
        val sequence = "AGCACACATGTGGTCTCTTAAAGCTGAGAGTATCACTGGGTTAGGACACGTTAATGTTCGCTCGTTACCAGACAATCCTGCTTGGCTTAGTGCGAGGTATGATAGGAAGGCAGTCAATCATGTAAGTGTAAAGATGGCTCTGATGTGCTCAAAAGCTGATCGCCAGTGGTCTTCCCATCGCAGAGCAGATGGCCCGCCAGGCACCATATGATCCTTGAACGGATCGCTGGGTAACCGATTTTCCGCTGCCAAGAGTTTTTGATGCCCGCCTTGCTCAACCTTACTGGGGCAGCAACTATTTGGGCCTTCCCGCAGTGACTACTACAATATGAGTATTGCTTAATGCGCCTCTAGCCATATCAACTCCCCCCTTGGCATCCGCTATGGCCAATGCACGTATATGGCCCATACTCGGTGGTCCTCTTTCGCGTTAGCGTGTTATTAAGATGCCGGTAGCGCCGGTGCGCGACCGATTAATATCCATGGGCAAAGCGCACATTGCCTAACCGTAGTAATTCACTGAATGCAGACGACCATCTAGTGAGTGATCAACGGCACCTTGCTCGGGATGCATCCTCTATAGGATAACTAGCCGAGCCCTTCTATTTGGCGGTTATCACGCTTCGCGTAAGGCTCCCAGATACACTGATCCAATCATACCATTGTCAAGGGAGCGGCGTCACTAACCGTTGACGCGTTGGCCCTGGCCTTAAGTGTTAGCGTCATGATCGCTAAATGCGATTCGCGTTGGAGCACTGAACTCAGATGTAGAAATTTGCAATTCACTCCGGGGAGAGGTTCGATTAGGTGATCCCTGAGAATCCGTTAAATGGAACGGTACGGCGCGCCTAATCCAGTGACCCTCGAATAAACCTCAGCTAGAGGCCCGGGCTGTGTTCAGACG"
        val vector = sequence.toList.map(_.toString).to[Vector]
        println(vector.reverse.map{
            case "A" => "T";
            case "C" => "G";
            case "G" => "C";
            case "T" => "A";
            case x => x
        }.reduceLeft(_ + _))
    }
}