object count {
    def main(args: Array[String]) {
        val sequence: String = "ACAAGCTTGCGAGTTCTACGTCGTCCACCACGCAAGGTTATTTCCGCGAGTCTGAAGGACACGCCCCTTTACCCATAAGGCGTGTCGCCCGCAAATTCCTAGGGTACCTGCTCGCAGTAGTGGTAATGTCATACCCTCTGGCTGTAGTAATAAGTTTAAAATAGTAAGCACTGTACCGAGTGTAAAGGTGGGAGTGCTCTCGTACACCCTTACGAGCTTCACCTATCCAGCCGCCTGCCAACGGCGCGGTTGCACTGGGGCGGGTGCGGCTCCGGTCCCTCATTTTCATACTGTCCAAGTCCCCTGTGTTCCTAGCTATTGTAAGCAACACACTAGTCAGTGTGCAAATTTATTTGGCTGGTTGTCAACTGCCAACTGCTAGGCCGCAAAAACAAGCCGCTTGAAACTCGGCACTAAGATATATTATTGTAAAACCGAGTCACGTGCTTGCCTATTATCTGGTTGCGGTGCAGGCCCATGGAATAACTTCCAAGATCGCGGGGTACTTTATCATTTGTACAATTGGCAAGTGAACAAAGGCACCTCAACGCCAGCAGCACACAGGGTTGTATGGTTCTCCTGTACCGACTTTGGACCGGTGTCGACCCTGCACACTGAGGCATTTCATATATCAGTAGATGCGGGGGCTTCCCGATCGGTCGACGTCCTCTAGAGTCTGCCGCTATTAATCCTAGCGGCCGTAATTCGAGGAAGCAAAATGGAGCTATCTGTTGTCCTCGCGTTCCCGGGGGCTGGTGACAGTCCACGCCAAGTTCAGATCATAGACTGCTTTGAATTCTTACTCTACATGTGGGACAGAGATCTCTACAAATAAATATAATTCTACAGGTCATGACTTGCATAATGAGCCATTGTCTTCAGAA"
        var A: Int = 0
        var C: Int = 0
        var G: Int = 0
        var T: Int = 0
        val vector: Vector[String] = sequence.toList.map(_.toString).to[Vector]
        vector.map((value) => {
            if (value == "A") {
                A += 1
            } else if (value == "C") {
                C += 1
            } else if (value == "G") {
                G += 1
            } else {
                T += 1
            }
        })
        println(A + " " + C + " " + G + " " + T)
    }
}