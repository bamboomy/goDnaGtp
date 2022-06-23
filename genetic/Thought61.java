package genetic;
import java.util.ArrayList;
class Thought61 extends Thought{
private static ArrayList<Thought61> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 110.02513253671108;
private double fd1 = 883.6906726142496;
private Thought fo0 = null;
private Thought fo1 = null;
Thought61 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought61 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought61 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought61 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought61 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought61 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought61 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought61 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought61 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought61 instance = new Thought61 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought61 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought61 instance = new Thought61 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought61 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought61 instance = new Thought61 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought61 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought61 instance = new Thought61 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought61 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought61 instance = new Thought61 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought61 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought61 instance = new Thought61 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought61 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought61 instance = new Thought61 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought61 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought61 instance = new Thought61 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd1 = fd0 + fd1;
    fb1 = !fb0;
    boolean lb0 = false;
    Output.points[1][1] -= fd0;
    Output.points[1][2] -= fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m3();
}
    fb0 = fb1 && lb0;
    Thought lo1 = Thought55.getInstance(fd0, fd1, fd0, fd1);
    fb0 = fd0 > fd1;
    fb1 = !lb0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fb1 = lb0 && fb0;
    Output.points[1][3] += fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    fd1 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought32.getInstance();
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Output.points[1][4] -= fd0;
    boolean lb1 = true;
    Thought lo2 = Thought83.getInstance(ab4, fb0, fb1, lb1);
    Thought lo3 = Thought88.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb4 = false;
    boolean lb5 = true;
    ab3 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
}
    lb4 = fd1 < fd0;
    Thought lo6 = Thought52.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb5, ab1, ab2, ab3);
}
    double ld7 = 195.78150797622897;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - ld7;
    Output.points[1][5] += fd0;
    ab4 = fb0 && fb1;
    lb1 = fd1 > ld7;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld7, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(lb4, lb5, ab1, ab2);
}
    ab3 = !ab4;
    ld7 = fd0 + fd1;
    ld7 *= -1;

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
    boolean lb0 = false;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    fb0 = ad1 < ad2;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought62.getInstance();
    fd1 *= -1;
    ad1 = ad2 + ad3;
    Output.points[1][6] -= ad4;
    fb1 = fd0 > fd1;
    double ld2 = 820.591216174944;
if(fo0 != null){
      fo1 = fo0.m4(ld2, ad1, ad2, ad3);
}
    lb0 = ad4 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;

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
    double ld0 = 660.9438171351063;
    boolean lb1 = false;
    Thought lo2 = Thought1.getInstance(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
    ad4 *= -1;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb1, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, ab1);
}
    double ld3 = 429.28684037900206;
    Output.points[1][7] += ld3;
    ad1 *= -1;
    ab2 = ad2 > ad3;
    ab3 = ab4 || fb0;
    ad4 *= -1;
    boolean lb4 = true;
    fb0 = fd0 > fd1;
    fb1 = lb1 || lb4;
    ab1 = !ab2;
    ld0 = ld3 + ad1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb5 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo6 = Thought44.getInstance();
    Output.points[1][8] += fd1;
if(fo1 != null){
      fo1.m1(ld0, ld3, ad1, ad2);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        boolean lb0 = true;
        lb0 = fb0 || fb1;
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4);
}
        fb0 = fd1 > fd0;
        fd1 *= -1;
if(fo0 != null){
          fo0.m3(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
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
    fb0 = ad1 > ad2;
    Thought lo0 = Thought39.getInstance();
    boolean lb1 = false;
    fb0 = fb1 || lb1;
    Thought lo2 = Thought10.getInstance(ad3, ad4, fd0, fd1);
    ad1 = ad2 - ad3;
    Thought lo3 = Thought75.getInstance(fb0, fb1, lb1, fb0);
    Thought lo4 = Thought52.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
    Thought lo5 = Thought78.getInstance(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb1, lb1, fb0, fb1);
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb1);
}
    boolean lb6 = true;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
    ad1 = ad2 - ad3;
if(ao2 != null){
      lb6 = ao2.m2(ad4, fd0, fd1, ad1, fb0, fb1, lb1, lb6);
}
if(ao3 != null){
      ad2 = ao3.m3();
}
if(fo0 != null){
      ao4 = fo0.m4(ad3, ad4, fd0, fd1);
}
    fb0 = ad1 > ad2;

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
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
        ab4 = fd0 < fd1;
if(ao4 != null){
          ao4.m3();
}
if(fo0 != null){
          fo0.m3(fd0, fd1, fd0, fd1);
}
        fb0 = fb1 || lb0;
if(fo1 != null){
          fo1.m2(ab1, ab2, ab3, ab4);
}
        fd0 = fd1 + fd0;
        boolean lb1 = true;
        for(int i1=0; i1<10; i1++){
            double ld2 = 70.31211039684692;
            ab4 = fd0 < fd1;
if(ao1 != null){
              ld2 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld2, fd0);
}
            Thought lo3 = Thought72.getInstance(fo1, ao1, ao2, ao3, fd1, ld2, fd0, fd1, fb0, fb1, lb1, lb0);
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
            fb0 = !fb1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    ab4 = ad1 < ad2;
    double ld0 = 990.3906541906847;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb1 = false;
if(ao2 != null){
      ao2.m2(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb1);
}
    fd1 = ld0 + ad1;
if(ao3 != null){
      ao3.m3();
}
    if (ab1) {
        if (ab2) {
            ab3 = ab4 && fb0;
            } else if (fb1) {
            boolean lb2 = true;
            lb2 = ad2 < ad3;
            double ld3 = 429.63619419035456;
            lb1 = !ab1;
            ab2 = ad3 > ad4;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
    Output.points[2][0] -= fd0;
    fb1 = fd1 < fd0;
    fd1 *= -1;
        boolean lb0 = false;
    lb0 = fb0 || fb1;
    fd0 *= -1;
    fd1 = fd0 + fd1;

Thought.STACK_COUNTER++;
return lb0;
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
    ab2 = ab3 || ab4;
        Thought lo0 = Thought22.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = fd1 > fd0;
    Output.points[2][1] -= fd1;
        ab4 = fd0 < fd1;
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    double ld1 = 416.7356403032628;
    boolean lb2 = false;
    boolean lb3 = false;

Thought.STACK_COUNTER++;
return lb3;
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
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    ad1 *= -1;
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
}
    ad2 *= -1;
    fb0 = fb1 && fb0;
    double ld0 = 830.304836124546;
    boolean lb1 = true;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, fb1, lb1, fb0, fb1);
}
    lb1 = !fb0;
    ad4 = fd0 - fd1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ad1, ad2, ad3, lb1, fb0, fb1, lb1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 644.17282902345;
if(fo1 != null){
      fo1.m1();
}
    boolean lb1 = true;
    ld0 = ad1 - ad2;
    double ld2 = 944.8544095766325;
    lb1 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    boolean lb3 = false;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo0.m2(ab4, fb0, fb1, lb1);
}
    double ld4 = 676.2298088562262;
    lb3 = fd0 > fd1;
    ld0 = ld2 - ld4;
    Output.points[2][2] -= ad1;
    ab1 = !ab2;
    Output.points[2][3] += ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld2, ld4, ad1, fb1, lb1, lb3, ab1);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb1, lb1, lb3, ab1);
}
        ab2 = ld0 > ld2;
        ab3 = ab4 || fb0;
if(fo1 != null){
          fo0 = fo1.m4();
}
        ld4 *= -1;
        fb1 = ad1 < ad2;
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought4.getInstance(fb0, fb1, fb0, fb1);
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fb1 = fd1 < fd0;
    double ld1 = 920.2132233777423;
    fb0 = !fb1;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    boolean lb2 = false;
    fb0 = fb1 && lb2;
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m3(ld1, fd0, fd1, ld1, lb2, fb0, fb1, lb2);
}
if(ao2 != null){
      ao2.m1();
}
    fd0 = fd1 + ld1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld1, fd0);
}
    fd1 = ld1 + fd0;
    fb0 = fb1 || lb2;

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
    if (fb0) {
        boolean lb0 = true;
        double ld1 = 845.496229184493;
if(ao1 != null){
          fb0 = ao1.m2(fb1, lb0, fb0, fb1);
}
        if (lb0) {
            Output.points[2][4] -= ld1;
            double ld2 = 970.6576989708043;
            boolean lb3 = false;
            Thought lo4 = Thought92.getInstance(ao2, ao3, ao4, fo0, ld1, ad1, ad2, ad3);
if(fo1 != null){
              fo1.m1(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld2, lb0, fb0, fb1, lb3);
}
            ld1 = ad1 + ad2;
            boolean lb5 = true;
if(fo0 != null){
              fo0.m2(fo1, ao1, ao2, ao3, lb5, lb0, fb0, fb1);
}
            if (lb3) {
                double ld6 = 900.68699839759;
}}}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fd1 *= -1;
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    if (fb0) {
        boolean lb0 = false;
        fb0 = fd0 < fd1;
if(ao3 != null){
          ao2 = ao3.m4();
}
        Output.points[2][5] += fd0;
        fb1 = fd1 > fd0;
if(fo0 != null){
          ao4 = fo0.m4(fd1, fd0, fd1, fd0);
}
        lb0 = ab1 && ab2;
if(fo1 != null){
          fd1 = fo1.m3(ab3, ab4, fb0, fb1);
}
        lb0 = ab1 && ab2;
        fd0 *= -1;
        Output.points[2][6] -= fd1;
        Thought lo1 = Thought68.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
        fd0 *= -1;
        ab3 = fd1 < fd0;
        } else {
        fb0 = fd1 > fd0;
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
              fb1 = fo0.m2(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
            fb0 = fd1 > fd0;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    double ld1 = 320.21334143777494;
    boolean lb2 = false;
    ld1 = ad1 + ad2;
    Output.points[2][7] -= ad3;
if(ao2 != null){
      ad4 = ao2.m3();
}
    Thought lo3 = Thought90.getInstance(fd0, fd1, ld1, ad1);
if(ao3 != null){
      ao3.m2(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ad2 = ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    double ld4 = 121.25600620533659;
    lb0 = lb2 || ab1;
    ld1 = ld4 + ad1;
    ad2 *= -1;
    boolean lb5 = false;
    double ld6 = 920.2254945441908;
    ab1 = ab2 && ab3;
    boolean lb7 = false;
    ab3 = ab4 && fb0;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, lb0, lb2, lb5, lb7);
}
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
    lb2 = fd1 < ld1;
    boolean lb8 = false;
    lb5 = lb7 && lb8;
    ld4 = ld6 - ad1;

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
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    Thought lo1 = Thought54.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 *= -1;
    boolean lb2 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0, fb1, lb0, lb2, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    fd0 *= -1;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 424.2275993145723;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    Output.points[2][8] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    double ld1 = 368.29776251464506;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld1, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 - ld0;
    boolean lb2 = true;
if(fo0 != null){
      ld1 = fo0.m3();
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld0, ld1);
}
    boolean lb3 = false;
    Output.points[3][0] -= fd0;

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
    fb1 = fb0 || fb1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    double ld0 = 835.6320816874382;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 + ad3;
    double ld1 = 414.9656056458669;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo2 = Thought18.getInstance(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb3 = true;
    fb0 = ld1 < ad1;
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb3, fb0, fb1);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld1, ad1, ad2);
}
    boolean lb4 = true;
    boolean lb5 = false;
    boolean lb6 = false;
    ad3 = ad4 + fd0;
    lb3 = lb4 || lb5;
    boolean lb7 = false;
    fd1 = ld0 - ld1;
    Thought lo8 = Thought71.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb6, lb7, fb0, fb1);

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
    Output.points[3][1] += ad2;
    boolean lb0 = false;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb0 = ad4 > fd0;
if(fo0 != null){
      fo0.m3(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought77.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
        boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb0);
}
    lb2 = ad2 > ad3;
    boolean lb3 = false;
    ad4 = fd0 - fd1;
    ad1 = ad2 + ad3;
    double ld4 = 715.7522529513628;

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
    Output.points[3][2] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    if (fb0) {
        fb1 = !fb0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        fd1 = fd0 - fd1;
        Thought lo0 = Thought55.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
        fb1 = fd0 > fd1;
        fd0 = fd1 + fd0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        fb0 = !fb1;
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
          ao1 = ao2.m4();
}
        fd0 = fd1 + fd0;
        for(int i0=0; i0<10; i0++){
            double ld1 = 382.4583790607312;
if(ao4 != null){
              ao3 = ao4.m4(fd0, fd1, ld1, fd0);
}
            double ld2 = 429.7518639817202;
            fb0 = fd0 < fd1;
}}
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
    for(int i0=0; i0<10; i0++){
        ad2 *= -1;
        fb1 = fb0 && fb1;
if(ao1 != null){
          ad3 = ao1.m3(fb0, fb1, fb0, fb1);
}
        fb0 = ad4 > fd0;
if(ao2 != null){
          fd1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
        fb1 = fd0 < fd1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        boolean lb0 = false;
        lb0 = fb0 || fb1;
        lb0 = fd0 < fd1;
if(ao1 != null){
          ad1 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
          fb1 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
          ad2 = fo0.m3(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
        double ld1 = 817.1856561432112;
        Output.points[3][3] += ld1;
        Output.points[3][4] -= ad1;
if(fo1 != null){
          fo1.m3();
}
        double ld2 = 881.477401263016;
if(ao1 != null){
          fb0 = ao1.m2(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
          fb1 = ao2.m2(lb0, fb0, fb1, lb0);
}
        boolean lb3 = true;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld1, ld2);
}
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    boolean lb0 = true;
        Thought lo1 = Thought2.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    double ld2 = 840.0157578503662;
    double ld3 = 603.5510579876454;
    ld3 = fd0 - fd1;
    ld2 = ld3 + fd0;
    Thought lo4 = Thought42.getInstance(ao4, fo0, fo1, ao1);
if(ao2 != null){
          fb0 = ao2.m2(fd1, ld2, ld3, fd0, fb1, lb0, ab1, ab2);
}
    ab3 = fd1 > ld2;
    Thought lo5 = Thought88.getInstance();
    Output.points[3][5] += ld3;
    ab4 = fd0 < fd1;
    double ld6 = 863.0275847839745;
    ld2 *= -1;
    fb0 = fb1 && lb0;

Thought.STACK_COUNTER++;
return ld3;
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
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    ab2 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
    double ld0 = 54.42554511020605;
    boolean lb1 = false;
    double ld2 = 821.396421071563;
    lb1 = ab1 && ab2;
if(fo0 != null){
      ld0 = fo0.m3(fo1, ao1, ao2, ao3, ld2, ad1, ad2, ad3);
}
    double ld3 = 423.2089357009691;
    ad3 = ad4 - fd0;
    ab3 = ab4 && fb0;
    double ld4 = 326.6157641988199;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ld0, ld2, ld3, fb1, lb1, ab1, ab2);
}
    ld4 = ad1 + ad2;
    boolean lb5 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    fb1 = ad3 > ad4;

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
    fb0 = fb1 || fb0;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought27.getInstance();
    boolean lb1 = true;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    Output.points[3][6] += fd0;
if(fo1 != null){
      fd1 = fo1.m3(fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
    boolean lb2 = false;
    lb2 = fb0 || fb1;
    fd0 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb1, lb2, fb0, fb1);
}
    fd1 = fd0 - fd1;
    Output.points[3][7] -= fd0;
    fd1 = fd0 - fd1;
    lb1 = lb2 || fb0;
    boolean lb3 = false;

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
    double ld0 = 921.0557370179645;
    Thought lo1 = Thought65.getInstance(fo0, fo1, fo0, fo1);
    ld0 *= -1;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = ld0 - fd0;
    fb1 = fd1 < ld0;
    ab1 = ab2 && ab3;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 + fd0;
if(fo1 != null){
      fo1.m1(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, lb2, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, ab1, ab2, ab3);
}
    fd0 = fd1 - ld0;
    fd0 = fd1 + ld0;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab4 = !fb0;
    fb1 = lb2 || ab1;
    fd0 *= -1;
    ab2 = fd1 < ld0;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
    Output.points[3][8] -= fd1;
if(fo1 != null){
      fo1.m3();
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
    lb0 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    boolean lb1 = false;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb0, lb1, fb0, fb1);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
}
    lb0 = ad2 > ad3;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    ad4 = fd0 + fd1;
    ad1 *= -1;
    lb1 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    boolean lb2 = false;
    Output.points[4][0] -= ad1;
    Thought lo3 = Thought49.getInstance(lb2, fb0, fb1, lb0);
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;

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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Output.points[4][1] += fd1;
    boolean lb0 = false;
    ab1 = ad1 > ad2;
    ad3 *= -1;
    ab2 = !ab3;
    ab4 = fb0 && fb1;
    lb0 = ab1 && ab2;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought63.getInstance(ao2, ao3, ao4, fo0);
    fb0 = fb1 || fb0;
    fd1 *= -1;
    boolean lb1 = true;
    Output.points[4][2] += fd0;
    Thought lo2 = Thought38.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
if(fo1 != null){
      fb1 = fo1.m2();
}
    boolean lb3 = false;
    fd1 *= -1;
    lb1 = fd0 > fd1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(lb3, fb0, fb1, lb1);
}
    Thought lo4 = Thought58.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);

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
    boolean lb0 = false;
    double ld1 = 513.8136556808987;
    double ld2 = 752.8551874476154;
    boolean lb3 = false;
    boolean lb4 = true;
    lb3 = ld2 > ad1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, lb4, fb0, fb1, lb0);
}
    boolean lb5 = false;
    fd1 = ld1 - ld2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb3, lb4, lb5, fb0);
}
    fb1 = ad1 > ad2;
    boolean lb6 = true;
    lb0 = !lb3;
if(fo1 != null){
      ad3 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld1, lb4, lb5, lb6, fb0);
}
    boolean lb7 = true;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb8 = false;
    double ld9 = 161.62134854438486;
if(ao3 != null){
      ld2 = ao3.m3(ld9, ad1, ad2, ad3);
}

Thought.STACK_COUNTER++;
return ao4;
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
    Output.points[4][3] += fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(ao1 != null){
      ab1 = ao1.m2(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    double ld0 = 128.64358662845234;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      ld0 = fo1.m3(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    fb0 = fd0 > fd1;
    fb1 = ld0 < fd0;
    fd1 = ld0 + fd0;
if(ao4 != null){
      lb1 = ao4.m2(fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = ld0 > fd0;
if(fo0 != null){
          fd1 = fo0.m3();
}
    fb1 = ld0 > fd0;
    lb1 = ab1 && ab2;
    boolean lb2 = true;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld0, fd0, fd1);
}
    ab2 = ld0 > fd0;
    ab3 = fd1 > ld0;
    ab4 = !fb0;
    fb1 = !lb1;
    fd0 *= -1;
    if (lb2) {
if(ao2 != null){
          ao2.m3(ab1, ab2, ab3, ab4);
}
}
Thought.STACK_COUNTER++;
return ao3;
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
    ad1 = ad2 + ad3;
    Output.points[4][4] -= ad4;
    ab1 = !ab2;
    ab3 = ab4 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    fb1 = ad3 < ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    fb0 = ad3 < ad4;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    boolean lb0 = false;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    double ld1 = 140.38280300939618;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld1, ad1, lb0, ab1, ab2, ab3);
}
    ad2 = ad3 + ad4;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Output.points[4][5] += fd0;
    fd1 = ld1 - ad1;
    Output.points[4][6] += ad2;
if(fo0 != null){
      ao4 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ab4, fb0, fb1, lb0);
}
    ld1 = ad1 + ad2;
    ad3 *= -1;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld1);
}
    Thought lo2 = Thought94.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    fb1 = fd0 > fd1;
    Output.points[4][7] += ld1;
    Thought lo3 = Thought33.getInstance(fo0, fo1, ao1, ao2, lb0, ab1, ab2, ab3);

Thought.STACK_COUNTER++;
return ao3;
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
    fd1 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || fb0;
    fd0 = fd1 - fd0;
    Output.points[4][8] += fd1;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    double ld0 = 415.14249312325603;
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = !fb0;
    boolean lb1 = true;
    fd1 = ld0 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
}
    boolean lb2 = true;
    fb0 = !fb1;

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
    fb0 = fb1 && fb0;
    Thought lo0 = Thought57.getInstance();
    fd0 = fd1 - fd0;
    Thought lo1 = Thought62.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
    Thought lo2 = Thought75.getInstance(fb1, fb0, fb1, fb0);
    fd0 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = fb0 && fb1;
    Output.points[5][0] -= fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    boolean lb3 = false;
    Output.points[5][1] += fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb3);
}
    fb0 = fd1 < fd0;

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
    boolean lb0 = true;
    Output.points[5][2] += fd1;
    Thought lo1 = Thought75.getInstance(fo0, fo1, fo0, fo1);
    lb0 = fb0 && fb1;
    boolean lb2 = false;
    lb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb0);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo3 = Thought26.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
    boolean lb4 = true;
    double ld5 = 643.5418009902756;
    lb2 = ld5 < fd0;
    lb4 = fb0 || fb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld5, fd0, fd1, ld5);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld5, fd0, fd1, lb0, lb2, lb4, fb0);
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
}
