public class Main {

    public static void main(String[] args){
        /**
         * ~ Requisitos funcionais:
         *
         *  # Login (usuário e senha)
         *      -> Gerente
         *      -> Operador
         *
         *  # Inserir Produto (Comprar)
         *      -> cód. produto (Primary Key)
         *      -> Preço de compra (cústo)
         *      -> Preço de vonda (faturamento)
         *      -> Quantidade em Estoque
         *
         *  # Remover Produto (Vender)
         *
         *  # Registrar Transações (Compra e Venda)
         *
         *  ~ Caso de uso:
         *
         *   # Classes:
         *      § Pessoa
         *          - STRING: nome;
         *          - int: cpf (Primary Key)
         *          - STRING endereço
         *          - int: telefone
         *          - STRING: sexo (masculino, feminino, n/binário, outro)
         *          + Get (nome, cpf, endereço, telefone)
         *          + Set (nome, cpf, endereço, telefone)
         *          + BOOL: validarCpf(cpf)
         *
         *          §§ Cliente
         *              - int: quantidade de compras
         *
         *
         *          §§ Funcionário (abtract)
         *              - STRING: login
         *              - String: Senha
         *              - float: Salário
         *              + Get (login, senha)
         *              + Set (login, senha)
         *              + void: alterarLogin(login)
         *              + void: alterarSenha(senha)
         *
         *              §§§ Gerente
         *                  - Caixa
         *                  - super (nome, cpf, endereço, telefone, login, senha)
         *                  + Get(nome, cpf, endereço, telefone, login, senha)
         *                  + Set(nome, cpf, endereço, telefone, login, senha)
         *                  + void: adicionarProduto()
         *                  + void: removerProduto()
         *                  + void: adicionarOperador()
         *                  + void: removerOperador()
         *                  + void: listarProdutos()
         *                  + void: listarFuncionários()
         *                  + void: procurarProduto(key)
         *                  + void: procurarFuncionario(key)
         *                  + void: venderProduto(add carrinho de compras)
         *                  + void: darBaixa()
         *                  + void: gerarComprovante()
         *                  + void: gerarRelatórioDeVendasDiario()
         *                  + void: gerarRelatórioDeVendasMensal()
         *
         *              §§§ Operador
         *                  - super (nome, cpf, endereço, telefone, login, senha)
         *                  + Get(nome, cpf, endereço, telefone, login, senha)
         *                  + Set(nome, cpf, endereço, telefone, login, senha)
         *                  + procurarProduto()
         *                  + listarProdutos()
         *                  + venderProduto(add carrinho de compras)
         *                  + gerarComprovante(carrinho de compras)
         *
         *      § Produto (abstract)
         *      -----Codigos de Produto-----
         *      calça     -> CA...
         *      saia      -> SA...
         *      blusa     -> BL...
         *      acessorio -> AC...
         *
         *      - String: código (Primary Key)
         *      - String: nome
         *      - String: cor
         *      - String: tamanho
         *      - int: quantidade
         *      - float: ValorDeCompra
         *      - float: ValorDeVenda
         *      + Get(código, tamanho, quantidade, valorDeCompra, valorDeCompra)
         *      + Set(código, tamanho, quantidade, valorDeCompra, valorDeCompra)
         *
         *      § Compra
         *          - Produto: produto
         *          + comprarProduto()
         *              reduz saldo do caixa
         *              incrementa qtd em estoque
         *      § Venda
         *          - Produto: produto
         *          - Cliente: cliente
         *          + venderProduto()
         *              aumentar saldo do caixa
         *              decrementar qtd em estoque
         *
         *      § RepositórioDePessoas
         *          - HashMap: <String, Pessoa> pessoas()
         *          + adicionarPessoa()
         *          + removerPessoa()
         *          + retornarPessoa()
         *          + listarPessoas()
         *      § RepositorioDeProdutos
         *          - HashMap <String, Produto> produtos()
         *          + adicionarProduto(String chave, Produto valor)
         *          + retornarProduto()
         *          + removerProduto()
         *          + listarProdutos()
         *      § RepositorioDeVendas
         *          - HashMap <String, Venda> vendas()
         *          + registrarVenda()
         *          + imprimirComprovante()
         *          + listarRelatórioDeVendas()
         *      § RepositórioDeCompras
         *          - HashMap <String, Compra> compras()
         *          + registrarCompra()
         *          + listarRelatórioDeCompras()
         *      § Caixa
         *          - float: saldo
         *          + Get(saldo)
         *          + Set(saldo)
         *
         *      § BaixaDoSistema
         *          - Caixa: caixa()
         *          - RepositórioDeFuncionarios: rf()
         *          - RepositórioDeVendas: rv()
         *          - RepositorioDeCompras: rc()
         *          + DarBaixa()
         *              Total de ativos (caixa, produtos)
         *              gastos (compras, salários)
         *              arrecadações (vendas)
         *              lucro liquido (arrecadações - gastos)
         *
         * */
    }
}
