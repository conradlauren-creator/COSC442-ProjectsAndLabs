package edu.towson.cis.cosc442.project1.monopoly;

public class MockRespondDialog implements RespondDialog {
    /**
     * Initializes a MockRespondDialog instance with the specified trade deal.
     * @param deal the TradeDeal object to associate with this dialog
     */
    public MockRespondDialog(TradeDeal deal) {
    }

    /**
     * Retrieves the mock response for the dialog, always returning true.
     * @return true indicating acceptance in the mock dialog
     */
    public boolean getResponse() {
        return true;
    }
}
