package com.coinomi.core.coins;

import com.coinomi.core.coins.families.BitFamily;
import com.coinomi.core.coins.families.PeerFamily;

/**
 * @author John L. Jegutanis
 */
public class AlexiumMain extends CoinType {
    private AlexiumMain() {
        id = "alexium.main";

        addressHeader = 23;
        p2shHeader = 85;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 500;

        family = PeerFamily.get();
        name = "Alexium";
        symbol = "AUM";
        uriScheme = "alexium";
        bip44Index = 52;
        unitExponent = 8;
        feePerKb = value(10000); // 0.0001 AUM
        minNonDust = value(1);
        softDustLimit = value(1000000); // 0.01 AUM
        softDustPolicy = SoftDustPolicy.AT_LEAST_BASE_FEE_IF_SOFT_DUST_TXO_PRESENT;
        signedMessageHeader = toBytes("Alexium Signed Message:\n");
    }

    private static AlexiumMain instance = new AlexiumMain();
    public static synchronized AlexiumMain get() {
        return instance;
    }
}
