package domain;

public class Donut {
    private boolean isDonut;
    private int paidDuration;
    private boolean canBublishFreeCopy;
    private String editMade;

    public boolean isDonut() {
        return isDonut;
    }

    public void setDonut(boolean donut) {
        isDonut = donut;
    }

    public int getPaidDuration() {
        return paidDuration;
    }

    public void setPaidDuration(int paidDuration) {
        this.paidDuration = paidDuration;
    }

    public boolean isCanBublishFreeCopy() {
        return canBublishFreeCopy;
    }

    public void setCanBublishFreeCopy(boolean canBublishFreeCopy) {
        this.canBublishFreeCopy = canBublishFreeCopy;
    }

    public String getEditMade() {
        return editMade;
    }

    public void setEditMade(String editMade) {
        this.editMade = editMade;
    }
}
