/**
 * 
 * @author Henri Lopes Schons
 */

for (int i = 1; i < 5; i++) {
    int chave = vetor[i];
    int j = i - 1;
    
    while (j >= 0 && vetor[j] > chave) {
        vetor[j + 1] = vetor[j];
        j = j - 1;
    }
    vetor[j + 1] = chave;
}

/**
 * Resposta da pergunta:
 * O algoritimo mais customizavel dentre o Bubble, Selection e Insertion é o Insertion Sort
 */