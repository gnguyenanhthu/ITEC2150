package FinalReview3_Q1_GenericClass;

/**
 * 
 * @author Dr. Wei Jin (wjin@ggc.edu)
 * 
 * Class: ConferenceProceeding
 *
 */
public class ConferenceProceeding extends Publication
{
    private String editor;

	/**
	 * @param title
	 * @param year
	 * @param editor
	 */
	public ConferenceProceeding(String title, int year, String editor) {
		super(title, year);
		this.editor = editor;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	@Override
	public String toString() {
		return "ConferenceProceeding [editor=" + editor + " ]" + super.toString();
	}

    
}
