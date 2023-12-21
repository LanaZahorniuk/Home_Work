package org.example.HW_4;
/*
    Maintainable (Обслуживаемый)
        Методы:
            void repairItem()
            void updateItemCondition(ItemCondition condition)
            ItemCondition checkCondition()
 */
public interface Maintainable {
    void repairItem();
    void updateItemCondition(BookStatus condition);
    ItemCondition checkCondition();
}
