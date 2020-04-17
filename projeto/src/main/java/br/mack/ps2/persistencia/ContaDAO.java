package br.mack.ps2.persistencia;

import java.util.List;

import br.mack.ps2.Conta;

public interface ContaDAO {

    boolean create(Conta conta);

    List<Conta> read();

    boolean update(Conta conta);

    boolean delete(Conta conta);

}