/**
 * 
 * @author Henri Lopes Schons
 */

int swap = vetor[i];
vetor[i] = vetor[j];
vetor[j] = swap;

/**
 * Resposta da pergunta:
 * O swap direto é falho, pois ao tentar executar por exemplo "arr[i] = arr[j] e arr[j] = arr[i]",
 * um dado sobrepõe o outro, fazendo com que o primeiro seja deletado e acaba nao preenchendo o lugar
 * do segundo.
 */