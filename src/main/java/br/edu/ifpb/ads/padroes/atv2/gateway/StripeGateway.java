package br.edu.ifpb.ads.padroes.atv2.gateway;

import br.edu.ifpb.ads.padroes.atv2.sdk.StripeSDK;

public class StripeGateway implements PagamentoGateway {
    private final StripeSDK sdk = new StripeSDK();

    @Override
    public void transferir(double valor) {
        sdk.charge(valor);
    }
}
