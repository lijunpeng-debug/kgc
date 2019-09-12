package cn.kgc.spring.print;

import cn.kgc.spring.interfaces.InkBox;
import cn.kgc.spring.interfaces.Paper;

/**
 * Created with IDEA
 * author:bdqn kgc zhou qi chao
 * Date:2019/9/2
 * Time:14:57
 */
public class Print {//打印机类

    private InkBox inkBox;//墨盒
    private Paper paper;//纸张

    public InkBox getInkBox() {
        return inkBox;
    }

    public void setInkBox(InkBox inkBox) {
        this.inkBox = inkBox;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public void show(){
        System.out.println("使用"+inkBox.getColor()+"的墨盒在"+paper.getSize()+"纸上打印");
    }
}
