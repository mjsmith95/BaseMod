package basemod.interfaces;

import com.megacrit.cardcrawl.cards.AbstractCard;

public interface AlternateCardCostModifier {
    int getAlternateResource(AbstractCard card);

    default boolean prioritizeAlternateCost(AbstractCard card) {
        return false;
    }

    default boolean canSplitCost(AbstractCard card) {
        return false;
    }

    int spendAlternateCost(AbstractCard card, int costToSpend);

    default boolean costEffectActive(AbstractCard card) {
        return true;
    }
}
