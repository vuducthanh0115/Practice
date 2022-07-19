package bai2;

import java.util.ArrayList;
import java.util.List;

public class Manager2 {
    List<Document> documents = new ArrayList();

    public void addDocument(Document doc) {
        this.documents.add(doc);
    }

    public boolean deleteDocument(String id) {
        /*for (int i = 0; i < this.documents.size(); i++) {
            Document x = this.documents.get(i);
            if (x.getId() == id) {
                this.documents.remove(i);
                return true;
            }
        }
        return false;*/

        /*for (Document doc : documents) {
            int index = doc.getId().indexOf(id);
            if (index >= 0) {
                this.documents.remove(index);
                return true;
            }
        }
        return false;*/

        Document doc = this.documents.stream().filter(d -> d.getId().equals(id)).findFirst().orElse(null);
        if (doc == null) {
            return false;
        } else {
            this.documents.remove(doc);
            return true;
        }
    }

    public void showDocument() {
        /*for (Document doc : documents) {
            System.out.println(documents.toString());
        }*/
        documents.forEach(doc -> System.out.println(doc.toString()));
    }

    public void searchByBook() {
        /*for (Document doc : documents) {
            if (doc instanceof Book) {
                System.out.println(doc.toString());
            }
        }*/
        this.documents.stream().filter(p -> p instanceof Book).forEach(doc -> System.out.println(doc.toString()));
    }

    public void searchByNewspaper() {
        /*for (Document doc : documents) {
            if (doc instanceof Newspaper) {
                System.out.println(doc.toString());
            }
        }*/
        this.documents.stream().filter(p -> p instanceof Newspaper).forEach(doc -> System.out.println(doc.toString()));
    }

    public void searchByMagazine() {
        /*for (Document doc : documents) {
            if (doc instanceof Magazine) {
                System.out.println(doc.toString());
            }
        }*/
        this.documents.stream().filter(p -> p instanceof Magazine).forEach(doc -> System.out.println(doc.toString()));
    }
}
