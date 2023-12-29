class RnaTranscription {
    String transcribe(String dnaStrand) {
        String rna = "";
        for(int i=0;i<dnaStrand.length();i++){
            switch(dnaStrand.charAt(i)){
                case 'G': rna += 'C';break;
                case 'C': rna += 'G';break;
                case 'T': rna += 'A';break;
                case 'A': rna += 'U';break;
            }
        }
        return rna;
    }
}
