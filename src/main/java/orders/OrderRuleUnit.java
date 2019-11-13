package orders;

import org.kie.kogito.rules.DataSource;
import org.kie.kogito.rules.DataStore;
import org.kie.kogito.rules.RuleUnitData;

import model.Order;

/**
 * OrderRuleUnit
 */
public class OrderRuleUnit implements RuleUnitData {

    private DataStore<Order> orders = DataSource.createStore();

    DataStore<Order> getOrders() {
        return orders;
    }
}