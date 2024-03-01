public class Main {
    // operations
    // init TextEditor
    // add text: "leetcode"
    // delete text(4 characters): "leet" return 4
    // add text: "practice" - "leetpractice"
    // curseRight(3): cur依然在最后 return etpractice
    // curseLeft(8):
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        textEditor.addText("leetcode");
        int deletedCharNum = textEditor.deleteText(4);
        System.out.printf("%d%n", deletedCharNum);
        textEditor.addText("practice");
        String cursorRightResultEmpty = textEditor.cursorRight(3);
        System.out.printf("%s%n", cursorRightResultEmpty);
        String cursorLeftResult = textEditor.cursorLeft(8);
        System.out.printf("%s%n", cursorLeftResult);
    }
}