package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {

        private final List<Pratos> cardapio = new ArrayList<>();

        public List<Pratos> getCardapio() {
                return cardapio;
        }

        public void adicionarPrato(Pratos novoPrato) {
                cardapio.add(novoPrato);
        }

        @Override
        public String toString() {
                return "Cardapio{" + cardapio + "}";
        }
}
