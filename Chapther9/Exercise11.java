import javax.print.attribute.standard.RequestingUserName;

class StringMixer{
	static String process(String s){
		char[] ca =new char[s.length()];
		if ((s.length())%2==0) {
			for(int i=0;i<s.length();i++){
				ca[i]=s.charAt(i+1);
				ca[i+1]=s.charAt(i);
			}
			return new String(ca);
		}
		else {
			for(int i=0;i<s.length();i++){
				ca[i]=s.charAt(i+1);
				ca[i+1]=s.charAt(i);
			}
			ca[s.length()-1]=s.charAt(s.length()-1);
			return new String(ca);
		}
	}
}
class Processor{
	public String name()
	{return getClass().getSimpleName();}
	Object process(Object input){return input;}
}
class Apply{
	public static void process(Processor p,Object object){
		System.out.println(p.process(object));
	}
}
class StringMixerAderpter implements ex11{
	public String name(){return "StringMixAderpter";}
    StringMixer stringMixer;
    public StringMixerAderpter(StringMixer stringMixer){
    	this.stringMixer=stringMixer;
    }
    public String process(Object input){
    	return StringMixer.process((String)input);
    }
}
public class Exercise11{
	public static void main(String[] args) {
		String string=new String(args[0]);
		Apply.process(new StringMixerAderpter(new StringMixer()), string);
	}
}
