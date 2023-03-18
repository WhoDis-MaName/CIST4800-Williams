package aop_package;
public aspect TraceAspectWilliams {

	pointcut classToTrace(): within(*App);

	pointcut methodToTrace():  classToTrace() &&  execution(* *(..));

    before(): methodToTrace() {
      System.out.println("\t[Before]: " + thisJoinPointStaticPart.getSignature() + 
            ", Line: " + thisJoinPointStaticPart.getSourceLocation().getLine());
    }

    after(): methodToTrace() {
      System.out.println("\t[After]: " + thisJoinPointStaticPart.getSourceLocation().getFileName());
    }
}
