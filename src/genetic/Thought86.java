package genetic;
import java.util.ArrayList;
class Thought86 extends Thought{
private static ArrayList<Thought86> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 590.262628622148;
private double fd1 = 932.2932659891826;
private Thought fo0 = null;
private Thought fo1 = null;
Thought86 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought86 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought86 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought86 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought86 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought86 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought86 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought86 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought86 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought86 instance = new Thought86 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought86 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought86 instance = new Thought86 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought86 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought86 instance = new Thought86 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought86 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought86 instance = new Thought86 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought86 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought86 instance = new Thought86 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought86 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought86 instance = new Thought86 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought86 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought86 instance = new Thought86 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought86 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought86 instance = new Thought86 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fb0 = fb1 || fb0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3();
}
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    double ld1 = 742.7618791742618;
    lb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    for(int i0=0; i0<10; i0++){
        fb0 = ld1 < fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
          lb0 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
        fb1 = ld1 > fd0;
        Thought lo2 = Thought76.getInstance(fd1, ld1, fd0, fd1);
        if (lb0) {
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
            double ld3 = 346.5691408185514;
            fb0 = fb1 || lb0;
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    if (fb1) {
        fd1 = fd0 + fd1;
if(fo0 != null){
          fo0.m1();
}
        if (ab1) {
            double ld0 = 763.2966978156011;
if(fo0 != null){
              fo1 = fo0.m4(ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
            boolean lb1 = false;
            fd0 = fd1 + ld0;
if(fo1 != null){
              fo1.m2(fo0, fo1, fo0, fo1);
}
            fd0 = fd1 - ld0;
            } else if (fb1) {
            Output.points[6][4] -= fd1;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
            fd0 = fd1 - fd0;
            fb0 = fb1 && ab1;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
            Thought lo2 = Thought23.getInstance(fd1, fd0, fd1, fd0);
            Thought lo3 = Thought31.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
            fb1 = fd1 > fd0;
            double ld4 = 722.7687721788623;
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd1 = ad1 - ad2;
    ad3 *= -1;
    ad4 *= -1;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    Output.points[6][5] -= ad1;
    ad2 = ad3 + ad4;
    Thought lo0 = Thought91.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fd0 > fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab2 = fo1.m2();
}
    ad1 = ad2 - ad3;
    ab3 = ab4 || fb0;
        ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
    fb0 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought61.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = ad1 > ad2;
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1);
}
    ab4 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
        boolean lb1 = false;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    fd1 = fd0 - fd1;
    boolean lb1 = false;
    lb1 = fd0 < fd1;
    Thought lo2 = Thought85.getInstance(fb0, fb1, lb0, lb1);
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo3 = Thought43.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
    Output.points[6][6] += fd0;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
}
    boolean lb4 = true;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb0, lb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    Output.points[6][7] += fd1;
    double ld5 = 934.8308987956647;
    lb4 = ld5 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld5, fd0, fd1);
}
if(ao3 != null){
          ld5 = ao3.m3(fb0, fb1, lb0, lb1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo0 = Thought91.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
    fd1 *= -1;
    fb1 = ad1 < ad2;
    Thought lo1 = Thought67.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
    ad1 *= -1;
    if (fb0) {
        fb1 = ad2 > ad3;
        ad4 = fd0 + fd1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
          ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
        double ld2 = 838.2592579038034;
        Thought lo3 = Thought98.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld2);
if(ao2 != null){
          ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
        Output.points[6][8] -= ad1;
        ad2 = ad3 + ad4;
        fb0 = fd0 > fd1;
if(ao3 != null){
          fb1 = ao3.m2();
}
        Thought lo4 = Thought26.getInstance(ld2, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
        double ld5 = 423.762176698815;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    fb0 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb0, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = lb0 && ab1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    Thought lo1 = Thought68.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fd0 = fo1.m3(ab2, ab3, ab4, fb0);
}
        fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    double ld3 = 309.37783508637625;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld3, fd0, ab3, ab4, fb0, fb1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    ab1 = ab2 || ab3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    ab4 = !fb0;
    ad4 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
if(ao4 != null){
          ao3 = ao4.m4(fb1, ab1, ab2, ab3);
}
if(fo0 != null){
          ab4 = fo0.m2();
}
        fb0 = fb1 || ab1;
        for(int i1=0; i1<10; i1++){
            ab2 = !ab3;
            Output.points[7][0] += ad3;
            double ld0 = 687.0057548973768;
            ad3 *= -1;
            for(int i2=0; i2<10; i2++){
                boolean lb1 = false;
if(ao1 != null){
                  fo1 = ao1.m4(ad4, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
                ad1 = ad2 - ad3;
                Thought lo2 = Thought1.getInstance(ao2, ao3, ao4, fo0);
}}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    fb0 = !fb1;
    fd1 *= -1;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    if (fb0) {
        fb1 = fd0 > fd1;
        boolean lb1 = true;
        fd0 *= -1;
        fd1 *= -1;
        lb1 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb1);
}
        boolean lb2 = true;
        lb2 = lb0 && fb0;
        fd0 = fd1 - fd0;
}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab1 = fo0.m2(fd1, fd0, fd1, fd0);
}
    ab2 = fd1 < fd0;
    if (ab3) {
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        ab4 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
        boolean lb0 = true;
        Thought lo1 = Thought51.getInstance();
        fd0 = fd1 - fd0;
        fd1 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        Output.points[7][1] -= fd0;
        Output.points[7][2] += fd1;
        double ld2 = 602.242996890952;
}
Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    ad1 = ad2 + ad3;
    if (fb1) {
        ad4 *= -1;
        for(int i0=0; i0<10; i0++){
            fb0 = fb1 || fb0;
}}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = ab1 || ab2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[7][3] += ad2;
if(fo1 != null){
      fo1.m1(ad3, ad4, fd0, fd1, lb0, lb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}

Thought.STACK_COUNTER++;
return ab3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        fb1 = fd1 > fd0;
    Output.points[7][4] += fd1;
    fd0 *= -1;
        double ld0 = 271.1496525720747;
        fb0 = fb1 && fb0;
    fb1 = fd0 < fd1;
    fb0 = ld0 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(ao1 != null){
      fb1 = ao1.m2(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    ld0 *= -1;
if(ao4 != null){
      ao4.m1(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fd1 *= -1;
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fb0 = fb1 && fb0;
    double ld1 = 922.7526735626988;
    boolean lb2 = false;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    Output.points[7][5] += fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    Thought lo0 = Thought86.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
    boolean lb1 = false;
    Thought lo2 = Thought55.getInstance(ad4, fd0, fd1, ad1);
    ad2 = ad3 + ad4;
    fb0 = !fb1;
    lb1 = fb0 || fb1;
    Thought lo3 = Thought0.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
    lb1 = fb0 && fb1;

Thought.STACK_COUNTER++;
return lb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    ab2 = fd1 > fd0;
if(ao1 != null){
      ao1.m2(ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      fd1 = ao2.m3();
}
if(ao3 != null){
      ab1 = ao3.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab4, fb0, fb1, ab1);
}
    Output.points[7][6] -= fd1;
if(ao4 != null){
      ab2 = ao4.m2(fd0, fd1, fd0, fd1);
}
    ab3 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    double ld0 = 251.85204449012357;
    ab4 = ld0 < fd0;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, ab1, ab2);
}
    ab3 = fd1 > ld0;

Thought.STACK_COUNTER++;
return ab4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    Thought lo0 = Thought73.getInstance();
if(ao2 != null){
      ao2.m2(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = ad1 - ad2;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought94.getInstance(ad2, ad3, ad4, fd0);
    fd1 *= -1;
    fb0 = ad1 < ad2;
    ad3 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
}

Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo0 != null){
      fo0.m2(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m1();
}
    fb1 = fd1 > fd0;
    Thought lo1 = Thought9.getInstance(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    Thought lo2 = Thought30.getInstance(fd1, fd0, fd1, fd0);
    Thought lo3 = Thought83.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
    Thought lo4 = Thought47.getInstance(lb0, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 *= -1;
    Thought lo5 = Thought72.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    fb1 = fd0 > fd1;
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        lb0 = !fb0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
        fb1 = fd0 < fd1;
        fd0 = fd1 - fd0;
        fd1 = fd0 - fd1;
}
Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    double ld0 = 45.091151906602505;
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
    boolean lb1 = true;
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    lb1 = fd0 < fd1;
    Output.points[7][7] += ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb1;
if(fo1 != null){
      ab1 = fo1.m2(fd0, fd1, ld0, fd0);
}
    Output.points[7][8] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    fd0 = fd1 - ld0;
    fd0 *= -1;
    boolean lb2 = false;
    Thought lo3 = Thought56.getInstance(ab1, ab2, ab3, ab4);

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3();
}
    ad1 = ad2 + ad3;
    fb0 = ad4 < fd0;
    boolean lb0 = true;
    fb0 = fd1 < ad1;
    fb1 = lb0 || fb0;
    ad2 = ad3 - ad4;
    fb1 = lb0 && fb0;
    fb1 = lb0 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
    if (lb0) {
        ad3 = ad4 - fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
        Output.points[8][0] -= ad1;
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
        fb1 = lb0 && fb0;
        double ld1 = 978.3840850171845;
        boolean lb2 = true;
        } else if (fb1) {
        ad1 = ad2 + ad3;
        ad4 *= -1;
        } else {
}
Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
        Output.points[8][1] += ad2;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    ab1 = ab2 || ab3;
    fd1 = ad1 + ad2;
    ab4 = !fb0;
    fb1 = ab1 || ab2;
        ab3 = ab4 || fb0;

Thought.STACK_COUNTER++;
return ad3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    double ld0 = 57.63753195971975;
    fb0 = ld0 < fd0;
    Output.points[8][2] += fd1;
if(fo0 != null){
      ao4 = fo0.m4();
}
if(ao1 != null){
      fo1 = ao1.m4(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fd0 *= -1;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    lb1 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb1, fb0, fb1, lb1);
}
        fd0 = fd1 - ld0;
        fd0 = fd1 - ld0;
        Output.points[8][3] -= fd0;
if(fo1 != null){
          fb0 = fo1.m2(fd1, ld0, fd0, fd1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(ao2 != null){
          ao1 = ao2.m4(fb1, lb1, fb0, fb1);
}
        lb1 = fb0 && fb1;
        fd0 = fd1 + ld0;
}
Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2();
}
    fb0 = ad1 < ad2;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought93.getInstance(ao4, fo0, fo1, ao1);
    fb1 = fb0 || fb1;
    ad1 = ad2 + ad3;
    fb0 = ad4 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
        Output.points[8][4] += ad4;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    boolean lb0 = false;
    ab4 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fb0 = fb1 && lb0;
    Output.points[8][5] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(lb0, ab1, ab2, ab3);
}
    ab4 = !fb0;
    boolean lb1 = true;
    fb0 = fb1 || lb0;
    fd0 = fd1 - fd0;
    lb1 = ab1 || ab2;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo3 = Thought12.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, lb0, lb1, lb2, ab1);
}
        Thought lo4 = Thought67.getInstance(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
    Thought lo5 = Thought95.getInstance(fd1, fd0, fd1, fd0);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo0 = Thought67.getInstance(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    fb1 = !ab1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
    fd0 = fd1 + ad1;
    boolean lb1 = true;
    boolean lb2 = true;
        ad2 = ad3 + ad4;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[8][6] -= fd1;
    double ld0 = 138.5957633213877;
    fb1 = ld0 < fd0;
    fd1 = ld0 + fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    double ld1 = 957.0434368648854;
    Thought lo2 = Thought66.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    boolean lb3 = true;
    boolean lb4 = false;
    lb4 = ld0 < ld1;
    Output.points[8][7] += fd0;
    boolean lb5 = true;
    lb5 = fb0 || fb1;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    lb0 = !ab1;
    Output.points[8][8] += fd1;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        double ld1 = 155.3377811629237;
    ld1 = fd0 - fd1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab2 = ld1 < fd0;
    Output.points[0][0] -= fd1;
    ab3 = !ab4;
    fb0 = !fb1;
    lb0 = ab1 || ab2;
    ab3 = !ab4;
    if (fb0) {
if(fo0 != null){
          fo1 = fo0.m4(ld1, fd0, fd1, ld1, fb1, lb0, ab1, ab2);
}
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    Output.points[0][1] += ad2;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld0 = 478.49508160960727;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ld0 + ad1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    Thought lo2 = Thought12.getInstance(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
    double ld3 = 322.46815909274204;
    lb1 = fb0 && fb1;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 > ad2;
    double ld0 = 633.647044229629;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought48.getInstance();
    fb1 = ab1 || ab2;
if(fo1 != null){
      ab3 = fo1.m2(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, ab2, ab3, ab4, fb0);
}
    fb1 = ad3 > ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, ad1);
}
    Thought lo3 = Thought76.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    ab4 = fd1 > ld0;
    ad1 *= -1;
    if (fb0) {
        fb1 = !lb2;
        ad2 = ad3 + ad4;
        Output.points[0][2] -= fd0;
if(fo0 != null){
          fo0.m2(ab1, ab2, ab3, ab4);
}
        fd1 = ld0 - ad1;
        Output.points[0][3] += ad2;
        boolean lb4 = false;
        ab4 = ad3 > ad4;
        double ld5 = 272.09158218358897;
if(fo1 != null){
          ad4 = fo1.m3();
}
        fb0 = fb1 || lb4;
        if (lb2) {
            for(int i0=0; i0<10; i0++){
}}}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m1(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
    boolean lb0 = true;
    fb0 = fb1 && lb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
}
    boolean lb1 = true;
    boolean lb2 = true;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    lb0 = lb1 || lb2;
    fd0 = fd1 - fd0;
    Output.points[0][4] -= fd1;
    fd0 = fd1 - fd0;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, lb1);
}
    lb2 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo3 = Thought72.getInstance(fd0, fd1, fd0, fd1, lb0, lb1, lb2, fb0);
    fb1 = lb0 || lb1;
    lb2 = fd0 > fd1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    fb0 = !fb1;
    fd0 *= -1;
    Thought lo4 = Thought93.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, lb0, lb1, lb2, fb0);
    Thought lo5 = Thought83.getInstance(ao4, fo0, fo1, ao1, fb1, lb0, lb1, lb2);
    fd1 = fd0 - fd1;
    Output.points[0][5] += fd0;
    double ld6 = 780.464156463718;

Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(ad2, ad3, ad4, fd0);
}
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    fb0 = fd1 < ad1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    boolean lb0 = true;
    Output.points[0][6] += fd1;
if(ao1 != null){
      ad1 = ao1.m3(fb0, fb1, lb0, fb0);
}
    double ld1 = 353.9054209736058;
    boolean lb2 = true;
    Output.points[0][7] += ad1;
    if (fb0) {
        fb1 = lb0 && lb2;
}
Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd0 *= -1;
    Output.points[0][8] += fd1;
    ab1 = ab2 && ab3;
    Thought lo0 = Thought71.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = ab1 && ab2;
        boolean lb1 = true;
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
        fb1 = lb1 || ab1;
        ab2 = fd0 > fd1;
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
        ab3 = !ab4;
        fd0 *= -1;
if(ao2 != null){
          ao2.m2(fb0, fb1, lb1, ab1);
}
if(ao4 != null){
          ao3 = ao4.m4();
}
        double ld2 = 451.8695895161071;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld2, fd0, ab2, ab3, ab4, fb0);
}
        Thought lo3 = Thought69.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld2, fd0, fd1, fb1, lb1, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
        ld2 = fd0 + fd1;
        ld2 *= -1;
        double ld4 = 515.1622997627294;
}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 133.45625984067382;
    ab1 = !ab2;
if(ao2 != null){
      ao2.m3(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    ab3 = ab4 && fb0;
        boolean lb1 = false;
    boolean lb2 = false;
    ab4 = fd1 < ld0;
    Output.points[1][0] -= ad1;
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao2.m3(fb0, fb1, lb1, lb2);
}
    Thought lo3 = Thought22.getInstance();
if(ao4 != null){
      ao3 = ao4.m4(ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    Thought lo4 = Thought82.getInstance(fo0, fo1, ao1, ao2);
    boolean lb5 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld0, ab4, fb0, fb1, lb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb2, lb5, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
if(fo0 != null){
      ab3 = fo0.m2(fo1, ao1, ao2, ao3, fd1, ld0, ad1, ad2);
}
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao4.m1(ab4, fb0, fb1, lb1);
}
        boolean lb6 = true;
        }

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 > fd0;
    Thought lo0 = Thought81.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought36.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    fb1 = fd0 < fd1;
    fd0 *= -1;
    fd1 *= -1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought90.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    double ld3 = 354.0438415510842;
    fb1 = fb0 && fb1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    double ld1 = 660.7923559088018;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 + ld1;
    Thought lo2 = Thought97.getInstance(fd0, fd1, ld1, fd0, lb0, fb0, fb1, lb0);
    fb0 = fd1 > ld1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, lb0, fb0, fb1, lb0);
}
    Output.points[1][1] -= fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fo0.m1(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m3();
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;
    double ld2 = 11.928483901726006;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ld2, fd0);
}
    boolean lb3 = false;
    fb0 = fd1 < ld2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0);
}
if(fo1 != null){
      fo1.m2(fb1, lb0, lb1, lb3);
}
    fd1 = ld2 - fd0;
    double ld4 = 845.9213868673575;
    fb0 = !fb1;
    boolean lb5 = false;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
