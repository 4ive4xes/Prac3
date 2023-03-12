public class Seller {
    public void modify(Telephone telephone){
        if (telephone.getModel().charAt(0) != 'n' || telephone.getModel().charAt(0) != 'N')
            telephone.setModel(telephone.getModel().toUpperCase());
        telephone.setModel(telephone.getModel().replace("o", "a"));
        telephone.setModel(telephone.getModel().replace("O", "A"));
    }
}
