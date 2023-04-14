/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import baitaplon.ThongKeNhanVienLapHoaDonPnl;
import bean.DanhMucBean;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.List;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.w3c.dom.events.MouseEvent;

/**
 *
 * @author ad
 */
public class ChuyenManHinhController {
    private JPanel root;
    private String kindSelected = "";
    
    private List<DanhMucBean> listItem = null;

    public ChuyenManHinhController(JPanel jpnroot) {
        this.root = jpnroot;
    }
    
    public void setView(JPanel jpnItem, JLabel jlbItem ){
        kindSelected = "ThongKe";
        
        jpnItem.setBackground(new Color(96,100,191));
        jlbItem.setBackground(new Color(96,100,191));
        
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new ThongKeNhanVienLapHoaDonPnl());
        root.validate();
        root.repaint();
    }
    
    /**
     *
     * @param listItem
     */
    public void setEvent(List<DanhMucBean> listItem){
        this.listItem = listItem;
        for (DanhMucBean item : listItem) {
            item.getJlb().addMouseListener(new labelEvent(item.getKind(),item.getJpn(),item.getJlb()));
        }
    } 
    class labelEvent implements MouseListener{
        private JPanel node;
        private String kind;
        
        private JPanel jpnItem;
        private JLabel jlbItem;
        private String kindSelected;

        public labelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }
        
        
        @Override
        public void mouseClicked(java.awt.event.MouseEvent e) {
            switch(kind){
                case "ThongKe":
                    node = new ThongKeNhanVienLapHoaDonPnl();
                    break;
                case "ThongTinCaNhan":
                    node = new ThongKeNhanVienLapHoaDonPnl();
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
        }

        @Override
        public void mousePressed(java.awt.event.MouseEvent e) {
            kindSelected = kind;
            jpnItem.setBackground(new Color(96,100,191));
            jlbItem.setBackground(new Color(96,100,191));
            
        }

        @Override
        public void mouseReleased(java.awt.event.MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mouseEntered(java.awt.event.MouseEvent e) {
            jpnItem.setBackground(new Color(96,100,191));
            jlbItem.setBackground(new Color(96,100,191));
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent e) {
            if(!kindSelected.equalsIgnoreCase(kind)){
                jpnItem.setBackground(Color.white);
                jlbItem.setBackground(Color.white);
            }
        }
        private void setChangeBackground(String kind){
            for(DanhMucBean item : listItem){
                if(item.getKind().equalsIgnoreCase(kind)){
                    item.getJlb().setBackground(new Color(96,100,191));
                    item.getJpn().setBackground(new Color(96,100,191));
                }else{
                    item.getJlb().setBackground(Color.WHITE);
                    item.getJpn().setBackground(Color.WHITE);   
                }
            }
        }
    }
    
}
