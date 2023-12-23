package ngordnet.main;

import ngordnet.hugbrowsermagic.HugNgordnetServer;

public class Main {
    public static void main(String[] args) {
        HugNgordnetServer hns = new HugNgordnetServer();
//        String wordFile = "./data/ngrams/top_49887_words.csv";
//        String countFile = "./data/ngrams/total_counts.csv";

        String synsetFile = "./data/wordnet/synsets16.txt";
        String hyponymFile = "./data/wordnet/hyponyms16.txt";

//      NGramMap ngm = new NGramMap(wordFile, countFile);

        WordNet wnet = new WordNet(hyponymFile, synsetFile);
        hns.startUp();
//      hns.register("history", new HistoryHandler(ngm));
//      hns.register("historytext", new HistoryTextHandler(ngm));
        hns.register("hyponyms", new HyponymsHandler(wnet));
    }
}
