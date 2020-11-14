package árvorebinária;

class Elemento // Classe que representa cada elemento da Árvore
{

    public int Num;

    public Elemento Dir;
    public Elemento Esq;

    public Elemento() // Construtor
    {
        Num = 0;
        Dir = null;
        Esq = null;
    }
}

public class Árvore {

    public Elemento Novo;
    public Elemento Raiz;
    public Elemento Aux;

    public Árvore() {
        Novo = null;
        Raiz = null;
    }

// =============================
    // Inserir um Elemento na Árvore
    // =============================
    public boolean Inserir(int Valor) {
        int Achou;                                // Flag de controle para saber se a rotina encontrou o local de inserção do elemento

        Novo = new Elemento();                    // Cria um novo elemento

        Novo.Num = Valor;                         // Atribui os valores aos atributos da classe
        Novo.Dir = null;
        Novo.Esq = null;

        if (Raiz == null) // Se é a primeira inserção, o elemento Raiz é nulo 
        {
            Raiz = Novo;                          //    Então ele recebe o elemento que acabou de entrar
        } else // Se não é a primeira inserção
        {
            Aux = Raiz;                           // Copia o endereço do nó Raiz para um elemento auxiliar

            Achou = 0;                            // Flag para saber se a rotina encontrou o local de inserção do elemento

            while (Achou == 0) // Enquanto a posição de inserção do novo elemento não tiver sido localizada
            {
                if (Novo.Num < Aux.Num) // Se o elemento que está sendo inserido é menor do que o elemento do nó em questão...
                {
                    if (Aux.Esq == null) //    Se o ponteiro para a esquerda é nulo, ou seja, não tem nada à esquerda dele...
                    {
                        Aux.Esq = Novo;           //       Então ele aponta para o elemento que está sendo inserido,
                        Achou = 1;                //       e sinaliza que achou a posição certa do novo elemento
                    } else //    Se não for nulo algum outro já foi inserido antes,
                    {
                        Aux = Aux.Esq;            //    e então vamos até ele
                    }
                } else if (Novo.Num > Aux.Num) // Se o elemento é maior...
                {
                    if (Aux.Dir == null) // Faz a mesma coisa com o ramo à direita do nó
                    {
                        Aux.Dir = Novo;
                        Achou = 1;
                    } else {
                        Aux = Aux.Dir;
                    }
                } else if (Novo.Num == Aux.Num) // Se o elemento é igual não fazemos nada
                {
                    return false;
                }
            }   // Volta a procurar o local de inserção
        }

        return true;
    }

    // ===============================
    // Pesquisar um Elemento na Árvore
    // ===============================
    public int Pesquisar(int Valor) {
        int Altura = 0;                            // Variável para armazenar a "Altura da Árvore"

        Aux = Raiz;

        while (Aux != null) // Enquanto existe Elemento na Árvore...
        {
            if (Aux.Num == Valor) // Encontrou o Valor? 
            {
                return Altura;                     //    Retorna a Altura da Árvore onde ele foi encontrado
            } else if (Valor < Aux.Num) // Se o Valor é menor,
            {
                Aux = Aux.Esq;                     //    vamos para a esquerda da árvore
                Altura++;
            } else // Senão
            {
                Aux = Aux.Dir;                     //    vamos para a direita
                Altura++;
            }
        }

        return -1;        // Se não encontrou o elemento retorna o valor -1
    }

    // Os métodos a seguir servem para listar os elementos da Árvore segundo diversos métodos,
    // "EM ORDEM", "PRÉ-ORDEM" e "PÓS-ORDEM". As soluções desenvolvidas são recursivas.
    //
    // O método "EM ORDEM", por exemplo, mostra o nó quando se passa "por baixo" dele.
    // O método "PRÉ-ORDEM", por sua vez, mostra o nó quando se passa "à esquerda" dele.
    // O método "PÓS-ORDEM", já mostra o nó quando se passa "à direita" dele.
    // ==========================================
    // Listar os Elementos da Árvore - "EM ORDEM"
    // ==========================================
    public void ListarEMORDEM(Elemento x) {
        if (x != null) {
            ListarEMORDEM(x.Esq);                       // Solução Recursiva
            System.out.printf("%1$5d", x.Num);
            ListarEMORDEM(x.Dir);
        }
    }

    // ===========================================
    // Listar os Elementos da Árvore - "PRÉ-ORDEM"
    // ===========================================
    public void ListarPRÉORDEM(Elemento x) {
        if (x != null) {
            System.out.printf("%1$5d", x.Num);
            ListarPRÉORDEM(x.Esq);
            ListarPRÉORDEM(x.Dir);
        }
    }

    // ===========================================
    // Listar os Elementos da Árvore - "PÓS-ORDEM"
    // ===========================================
    public void ListarPÓSORDEM(Elemento x) {
        if (x != null) {
            ListarPÓSORDEM(x.Esq);
            ListarPÓSORDEM(x.Dir);
            System.out.printf("%1$5d", x.Num);
        }
    }

    // ===========================
    // Excluir Elementos da Árvore
    // ===========================
    public Elemento Excluir(Elemento x, int Valor) {
        Elemento Aux1, Aux2;

        if (Valor == x.Num) // Achou o elemento a ser excluído?
        {
            if (x.Esq == x.Dir) // Se o elemento a ser excluído não possui filhos
            {
                return null;                            //    Retorna null excluindo o elemento procurado
            } else if (x.Esq == null) // Se o elemento a ser excluído não possui filhos para a esquerda
            {
                return x.Dir;                           //    Ele passa a ser o elemento da direita
            } else if (x.Dir == null) // Se o elemento a ser excluído não possui filhos para a direita
            {
                return x.Esq;                           //    Ele passa a ser o elemento da esquerda
            } else // Se o elemento a ser excluído possui filhos para a esquerda e para a direita
            {
                Aux1 = x.Dir;
                Aux2 = x.Dir;

                while (Aux1.Esq != null) {
                    Aux1 = Aux1.Esq;
                }

                Aux1.Esq = x.Esq;

                return Aux2;
            }
        } else if (Valor > x.Num) // O elemento a ser excluído é maior que o elemento atual?
        {
            x.Dir = Excluir(x.Dir, Valor);              //    Percorre
        } else // Valor < x.Num                        // O elemento a ser excluído é menor que o elemento atual?
        {
            x.Esq = Excluir(x.Esq, Valor);
        }

        return x;
    }
}
