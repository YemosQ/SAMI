package util;

import javafx.scene.control.TreeCell;
import javafx.scene.control.TreeItem;

import javax.swing.*;

public class DobleClic extends TreeCell<String> {
        @Override
        protected void updateItem(String item, boolean empty) {
            super.updateItem(item, empty);
            if (item == null || empty) {
                setText(null);
            } else {
                setText(item);
            }
        }
        public DobleClic() {
            super();
            setOnMouseClicked(event -> {
                TreeItem<String> ti = getTreeItem();
                if (ti == null || event.getClickCount() < 2)
                    return;
                JOptionPane.showMessageDialog(null,"Un solo Clic");
                // do something here.
            });
        }
}
