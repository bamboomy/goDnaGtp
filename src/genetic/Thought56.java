package genetic;
import java.util.ArrayList;
class Thought56 extends Thought{
private static ArrayList<Thought56> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 292.1044017673633;
private double fd1 = 698.277322171718;
private Thought fo0 = null;
private Thought fo1 = null;
Thought56 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought56 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought56 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought56 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought56 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought56 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought56 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought56 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought56 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought56 instance = new Thought56 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought56 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought56 instance = new Thought56 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought56 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought56 instance = new Thought56 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought56 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought56 instance = new Thought56 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought56 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought56 instance = new Thought56 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought56 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought56 instance = new Thought56 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought56 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought56 instance = new Thought56 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought56 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought56 instance = new Thought56 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 + fd0;
    Thought lo0 = Thought35.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought77.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    if (fb0) {
        fb1 = !fb0;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
        double ld2 = 826.4192297828534;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld2, fd0);
}
        if (fb1) {
            Thought lo3 = Thought2.getInstance(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1);
            if (fb0) {
                fb1 = !fb0;
                ld2 = fd0 - fd1;
if(fo1 != null){
                  fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
                  fo0 = fo1.m4();
}
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    boolean lb0 = false;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = lb0 || ab1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
    fb0 = !fb1;
    fd0 *= -1;
    Thought lo2 = Thought47.getInstance(fo1, fo0, fo1, fo0, lb0, lb1, ab1, ab2);
    fd1 *= -1;
    fd0 = fd1 + fd0;
    double ld3 = 487.1840378297191;
    boolean lb4 = true;
    ab2 = fd0 < fd1;
    ab3 = !ab4;
if(fo1 != null){
      fo1.m3(ld3, fd0, fd1, ld3);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld3, fd0, fd1);
}
    ld3 *= -1;
    fb0 = fb1 || lb0;
    Output.points[8][2] -= fd0;
    lb1 = lb4 && ab1;
if(fo1 != null){
      fo1.m3(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fb0 = fo0.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
    fb0 = fd0 > fd1;
    Thought lo1 = Thought83.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
    lb0 = fb0 || fb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m1(fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    double ld2 = 349.2191827723882;
    fb0 = ad4 > fd0;

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
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    boolean lb0 = false;
    ad2 = ad3 + ad4;
    boolean lb1 = false;
    lb0 = fd0 > fd1;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld2 = 454.1222240838634;
    lb1 = ab1 && ab2;
    ab3 = ad3 > ad4;

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
if(ao1 != null){
          fd1 = ao1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
    Output.points[8][3] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    boolean lb0 = false;
    fd1 = fd0 - fd1;
    boolean lb1 = true;
    boolean lb2 = true;
    lb0 = lb1 && lb2;
    double ld3 = 576.2649587259798;
    ld3 = fd0 - fd1;

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
    ad1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ad1 + ad2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    fb0 = ad1 < ad2;
    fb1 = ad3 > ad4;
    fd0 = fd1 + ad1;
        fb0 = !fb1;
        fb0 = ad2 > ad3;
    fb1 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    fb0 = fb1 || fb0;
    double ld0 = 821.701491279794;

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
    Output.points[8][4] -= fd1;
    ab2 = !ab3;
if(ao1 != null){
      ao1.m1(ab4, fb0, fb1, ab1);
}
        fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd1 = fd0 + fd1;
    double ld0 = 788.0236217277202;
    boolean lb1 = true;
if(ao4 != null){
      ao4.m3(ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - ld0;
    double ld2 = 602.0336166695456;
    fb0 = fb1 || lb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ld2 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld0, ld2, fd0, fd1, ab1, ab2, ab3, ab4);
}
        Output.points[8][5] += ld0;
        for(int i1=0; i1<10; i1++){
            boolean lb3 = false;
if(fo0 != null){
              ab4 = fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, lb3, lb1);
}
            boolean lb4 = false;
if(fo0 != null){
              ao4 = fo0.m4(ld2, fd0, fd1, ld0);
}
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
    boolean lb0 = true;
    Thought lo1 = Thought71.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
if(ao1 != null){
      fo1 = ao1.m4(lb0, ab1, ab2, ab3);
}
    boolean lb2 = true;
    ab3 = !ab4;
    fb0 = fb1 && lb0;
    fd1 *= -1;
    lb2 = ab1 || ab2;
if(ao2 != null){
      ad1 = ao2.m3();
}
    ab3 = ab4 && fb0;
if(ao3 != null){
      ad2 = ao3.m3(ad3, ad4, fd0, fd1, fb1, lb0, lb2, ab1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    double ld3 = 723.311840611626;
    boolean lb4 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld3, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought19.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    fb1 = fd0 < fd1;
    fb0 = !fb1;
    Thought lo1 = Thought24.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m3(fb0, fb1, fb0, fb1);
}
        double ld2 = 342.6601212403201;
    Output.points[8][6] += ld2;
if(fo0 != null){
      fo0.m1();
}
    fb0 = !fb1;
    fb0 = fd0 > fd1;
    ld2 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(ld2, fd0, fd1, ld2, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb3 = true;

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
    fd0 = fd1 + fd0;
    Thought lo0 = Thought90.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = ab1 && ab2;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought50.getInstance(ab3, ab4, fb0, fb1);
    double ld2 = 966.5836311971382;
    if (ab1) {
        ab2 = fd0 > fd1;
        double ld3 = 512.1603360187961;
        Thought lo4 = Thought47.getInstance();
        ab3 = ld3 < ld2;
        Thought lo5 = Thought84.getInstance(fd0, fd1, ld3, ld2, ab4, fb0, fb1, ab1);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld3, ld2, fd0, ab2, ab3, ab4, fb0);
}
        Thought lo6 = Thought5.getInstance(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
        if (ab4) {
if(fo0 != null){
              fd1 = fo0.m3(ld3, ld2, fd0, fd1);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, ld2, fd0, fd1);
}
            ld3 = ld2 - fd0;
if(fo0 != null){
              fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
            fd1 *= -1;
if(fo1 != null){
              ab3 = fo1.m2();
}
            Thought lo7 = Thought89.getInstance(ld3, ld2, fd0, fd1, ab4, fb0, fb1, ab1);
}}
Thought.STACK_COUNTER++;
return ab2;
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
    ad1 = ad2 - ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || fb0;
    Thought lo0 = Thought75.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fb1 = !fb0;
    double ld1 = 914.7294916518478;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    Thought lo0 = Thought72.getInstance();
if(fo1 != null){
      ab1 = fo1.m2(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought55.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
    fd1 *= -1;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    ab2 = ab3 || ab4;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    fb0 = ad4 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fb1, lb2, ab1, ab2);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo3 = Thought48.getInstance(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
    Thought lo4 = Thought17.getInstance(fo0, fo1, fo0, fo1);

Thought.STACK_COUNTER++;
return lb2;
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
    fd1 *= -1;
    double ld0 = 399.196929972123;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    Output.points[8][7] -= fd0;
    fd1 = ld0 - fd0;
    fd1 = ld0 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought44.getInstance(ld0, fd0, fd1, ld0);
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0);
}
    fb0 = !fb1;
    fb0 = fd1 < ld0;
    fd0 = fd1 + ld0;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought21.getInstance();
    fb1 = fd0 > fd1;
if(ao1 != null){
      ld0 = ao1.m3(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fb0 = !fb1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ld0;
    fb0 = fb1 || fb0;
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, ld0, fd0);
}

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    fb0 = ad2 < ad3;
    Thought lo0 = Thought39.getInstance(fb1, fb0, fb1, fb0);
    double ld1 = 359.4446240298755;
if(ao1 != null){
      ad3 = ao1.m3();
}
    ad4 = fd0 + fd1;
    fb1 = ld1 > ad1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > ld1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    boolean lb2 = false;
if(ao4 != null){
              ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, lb2, fb0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb1, lb2, fb0, fb1);
}
    boolean lb3 = true;
    double ld4 = 193.2117102684839;

Thought.STACK_COUNTER++;
return lb2;
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
    fd1 = fd0 + fd1;
    ab2 = fd0 > fd1;
    double ld0 = 15.413353303417384;
if(ao3 != null){
      ao2 = ao3.m4(ld0, fd0, fd1, ld0);
}
    double ld1 = 319.4013519471412;
    ab3 = ld1 > fd0;
    fd1 *= -1;
    double ld2 = 945.3985844102058;
    ab4 = ld0 > ld1;
    boolean lb3 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld2, fd0, fd1, ld0);
}
    ld1 *= -1;
    ld2 = fd0 + fd1;
    ab4 = fb0 && fb1;
if(ao4 != null){
      ao4.m3(lb3, ab1, ab2, ab3);
}
    ld0 = ld1 + ld2;
    fd0 *= -1;
    ab4 = fb0 && fb1;
    fd1 = ld0 + ld1;
    if (lb3) {
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad1 = ao1.m3();
}
if(ao2 != null){
      ab1 = ao2.m2(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    boolean lb0 = true;
    fd1 = ad1 - ad2;
    fb0 = ad3 < ad4;
    fb1 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
        Output.points[8][8] += fd0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, ab1, ab2, ab3);
}
}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
        fd0 = fd1 - fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    double ld0 = 992.9955770105339;
    fd0 = fd1 - ld0;
    fb0 = !fb1;
    boolean lb1 = true;
        double ld2 = 115.89071548249466;
    ld2 = fd0 + fd1;
    ld0 = ld2 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb1);
}
    fd1 *= -1;
    ld0 *= -1;
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      fb0 = fo0.m2(ld2, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
}
    ld2 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    ld0 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
    fb0 = ld2 < fd0;
    fd1 = ld0 - ld2;
    fd0 = fd1 + ld0;
    if (fb1) {
}
Thought.STACK_COUNTER++;
return ld2;
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
    ab1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    ab2 = ab3 || ab4;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    Output.points[0][0] -= fd1;
    ab1 = !ab2;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    ab2 = ab3 || ab4;
    fb0 = fb1 && lb0;
    fd0 = fd1 + fd0;
    ab1 = ab2 || ab3;
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, lb0, ab1);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = !fb1;
    ad1 = ad2 - ad3;
    fb0 = ad4 > fd0;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought52.getInstance(fo0, fo1, fo0, fo1);
    ad4 = fd0 + fd1;
    fb1 = !lb0;
    fb0 = ad1 > ad2;
    fb1 = ad3 > ad4;
    fd0 *= -1;
    lb0 = fd1 < ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    fd1 = ad1 - ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    double ld2 = 10.253577153701844;
    boolean lb3 = true;
    ad3 *= -1;
        boolean lb4 = true;
    lb0 = lb3 && lb4;

Thought.STACK_COUNTER++;
return ad4;
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
    boolean lb0 = true;
    ad2 = ad3 + ad4;
    Thought lo1 = Thought78.getInstance(fd0, fd1, ad1, ad2);
    ab1 = ab2 && ab3;
    for(int i0=0; i0<10; i0++){
        Output.points[0][1] += ad3;
        boolean lb2 = true;
if(fo1 != null){
          ab3 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
        Thought lo3 = Thought12.getInstance(ab4, fb0, fb1, lb2);
        lb0 = !ab1;
if(fo0 != null){
          ab2 = fo0.m2();
}
        ab3 = ad2 > ad3;
        Thought lo4 = Thought38.getInstance(ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb2);
        ad2 = ad3 - ad4;
        lb0 = fd0 < fd1;
        ad1 = ad2 + ad3;
        ad4 *= -1;
        Thought lo5 = Thought15.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb2, lb0, ab1);
}
        ab2 = !ab3;
        }
    fb0 = ad3 < ad4;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 > fd0;
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
    boolean lb0 = true;
    fb0 = fb1 || lb0;
if(ao3 != null){
      ao3.m3(fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
    double ld2 = 305.9907938371667;
    fb1 = lb0 && lb1;
    Thought lo3 = Thought30.getInstance();
    fb0 = fd0 < fd1;
if(ao4 != null){
      fb1 = ao4.m2(ld2, fd0, fd1, ld2, lb0, lb1, fb0, fb1);
}
    lb0 = !lb1;
    fb0 = fb1 && lb0;
    fd0 = fd1 - ld2;
    fd0 = fd1 - ld2;
    fd0 = fd1 + ld2;
    fd0 = fd1 - ld2;

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
    double ld0 = 953.6283037798628;
    fb1 = fb0 || fb1;
    boolean lb1 = false;
    double ld2 = 489.268014008241;
    lb1 = fb0 || fb1;
    Output.points[0][2] -= ld0;
    lb1 = fb0 || fb1;
    Output.points[0][3] -= ld2;
if(ao1 != null){
      lb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    Thought lo3 = Thought35.getInstance(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb0, fb1, lb1, fb0);
    fb1 = lb1 || fb0;
    fb1 = lb1 && fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb1, fb0, fb1);
}
if(ao4 != null){
      lb1 = ao4.m2(fd0, fd1, ld0, ld2);
}

Thought.STACK_COUNTER++;
return ad1;
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
    Thought lo0 = Thought22.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
    fb1 = !ab1;
    fd0 = fd1 + fd0;
    boolean lb1 = false;
    double ld2 = 931.9179479310235;
    ab1 = !ab2;
    Thought lo3 = Thought75.getInstance();
    fd0 *= -1;
    ab3 = !ab4;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld2, fd0, fd1, fb0, fb1, lb1, ab1);
}
if(ao3 != null){
      ld2 = ao3.m3(ao4, fo0, fo1, ao1);
}
    boolean lb4 = false;
        Output.points[0][4] -= fd0;
    ab1 = fd1 > ld2;
    ab2 = !ab3;
    fd0 *= -1;
    fd1 = ld2 - fd0;
    double ld5 = 162.44192901701825;
    ab4 = fd0 < fd1;
if(ao2 != null){
      ld2 = ao2.m3(ao3, ao4, fo0, fo1, ld5, fd0, fd1, ld2, fb0, fb1, lb1, lb4);
}
    ld5 = fd0 + fd1;
    Thought lo6 = Thought3.getInstance(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
    boolean lb7 = false;
    ab4 = ld2 > ld5;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 170.9280136003063;
    ab2 = ad1 > ad2;
    ad3 = ad4 + fd0;
    ab3 = ab4 && fb0;
    fd1 = ld0 + ad1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    double ld1 = 188.78986602481152;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld1);
}
    boolean lb2 = false;
    fb0 = fb1 || lb2;
    ad1 = ad2 + ad3;
    Thought lo3 = Thought77.getInstance(ab1, ab2, ab3, ab4);
    Thought lo4 = Thought85.getInstance();

Thought.STACK_COUNTER++;
return ad4;
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
    fb1 = !fb0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    double ld1 = 937.6432479414206;
    fb0 = fb1 || lb0;
    double ld2 = 777.133881092519;
    ld2 = fd0 + fd1;
    fb0 = ld1 < ld2;
        boolean lb3 = false;
    fd0 = fd1 - ld1;
if(fo0 != null){
      fo1 = fo0.m4(ld2, fd0, fd1, ld1);
}
    ld2 = fd0 + fd1;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld1, ld2, fd0, fd1);
}
    boolean lb4 = true;
    lb3 = lb4 || fb0;
    Output.points[0][5] += ld1;
    boolean lb5 = false;

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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd1 = fo1.m3(ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
    fb0 = fb1 || ab1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = !ab3;
if(fo0 != null){
      ab4 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    double ld0 = 456.28753603321695;
    Output.points[0][6] -= fd0;
    fd1 *= -1;
    boolean lb1 = true;
    Thought lo2 = Thought76.getInstance(fo1, fo0, fo1, fo0);
    ab2 = ab3 && ab4;
    fb0 = ld0 < fd0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
}
    ab1 = ld0 < fd0;
    ab2 = ab3 || ab4;
    fb0 = fd1 > ld0;
    fb1 = lb1 && ab1;
    for(int i0=0; i0<10; i0++){
        ab2 = ab3 || ab4;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
        fb0 = !fb1;
        Output.points[0][7] -= fd1;
if(fo0 != null){
          ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
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
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = ad4 > fd0;
    boolean lb0 = false;
    fd1 *= -1;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    boolean lb1 = true;
    boolean lb2 = true;
    lb2 = fb0 || fb1;
    lb0 = fd1 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo3 = Thought30.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb1, lb2, fb0, fb1);
    double ld4 = 71.86305735081625;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb1, lb2, fb0);
}
        Thought lo5 = Thought35.getInstance(fd0, fd1, ld4, ad1);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    Output.points[0][8] += fd1;
    lb0 = ld4 < ad1;
    double ld6 = 430.0845975841193;
    boolean lb7 = true;

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
    ab2 = !ab3;
    boolean lb0 = false;
    Output.points[1][0] -= ad1;
    ad2 *= -1;
if(fo0 != null){
      fo0.m2(ab3, ab4, fb0, fb1);
}
    lb0 = !ab1;
    ab2 = ad3 > ad4;
    ab3 = fd0 < fd1;
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad1 = ad2 - ad3;
    lb0 = ab1 && ab2;
if(fo1 != null){
      ab3 = fo1.m2(ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
}
    ad2 = ad3 - ad4;
    double ld1 = 65.09596970452047;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld2 = 128.73723505636335;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought12.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
    ld1 *= -1;
if(fo1 != null){
      ab2 = fo1.m2(ld2, ad1, ad2, ad3);
}
    double ld4 = 760.2494348338462;

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
    fb1 = fb0 && fb1;
    fd1 *= -1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    fd0 *= -1;
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(lb1, fb0, fb1, lb0);
}
    boolean lb2 = false;
    boolean lb3 = false;
if(ao3 != null){
      fd1 = ao3.m3();
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(ao4 != null){
      ao4.m2(fd0, fd1, fd0, fd1, lb1, lb2, lb3, fb0);
}
    fb1 = !lb0;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    lb1 = lb2 || lb3;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 > ad2;
    ad3 = ad4 - fd0;
    fd1 *= -1;
    ad1 = ad2 - ad3;
    fb1 = ad4 < fd0;
    fb0 = fd1 > ad1;
    fb1 = ad2 > ad3;
    double ld0 = 361.2762291558645;
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        ad3 = ad4 - fd0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ld0, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fb0 = ao1.m2(ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ld0, ad1, ad2, ad3);
}
    fb1 = fb0 || fb1;
    boolean lb1 = true;
if(ao1 != null){
      ad4 = ao1.m3(lb1, fb0, fb1, lb1);
}
    boolean lb2 = true;
    fd0 = fd1 - ld0;
if(ao2 != null){
      lb2 = ao2.m2();
}
if(ao3 != null){
      fb0 = ao3.m2(ad1, ad2, ad3, ad4, fb1, lb1, lb2, fb0);
}
    fb1 = !lb1;
    boolean lb3 = true;
    boolean lb4 = false;
    fd0 = fd1 - ld0;
    ad1 = ad2 + ad3;
    Output.points[1][1] += ad4;

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
    Output.points[1][2] += fd1;
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0);
}
    double ld0 = 857.8403507065835;
    ab3 = !ab4;
    double ld1 = 830.7219422555581;
    ld0 = ld1 - fd0;
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
        ab1 = ab2 && ab3;
        fd1 = ld0 - ld1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ld1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
          fd0 = fo1.m3(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
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
    double ld0 = 135.8952236481283;
if(ao2 != null){
      ab2 = ao2.m2(ad1, ad2, ad3, ad4);
}
    ab3 = !ab4;
if(ao3 != null){
          fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ad1);
}
    fb1 = ad2 > ad3;
    ab1 = ab2 && ab3;
    ad4 = fd0 + fd1;
    double ld1 = 704.9199299186006;
    ab4 = fb0 && fb1;
    Output.points[1][3] += ld0;
    ld1 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;

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
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    double ld0 = 343.3278195602929;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb1 = false;
    fd0 *= -1;
    boolean lb2 = true;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, lb1, lb2, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, lb2, fb0, fb1);
}
if(fo1 != null){
      lb1 = fo1.m2(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 + fd0;

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
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    boolean lb0 = true;
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    fd0 = fd1 - fd0;
    boolean lb1 = false;
    lb1 = fd1 < fd0;
    fb0 = fb1 || lb0;
    lb1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
    double ld2 = 787.0827375591653;
    fd0 = fd1 - ld2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb1 = fb0 && fb1;
    lb0 = !lb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
    fd1 *= -1;
    double ld3 = 57.204151672610365;
    fb0 = ld2 < ld3;

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
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought82.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    boolean lb2 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Output.points[1][4] += fd1;
        fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb1);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb2 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
    double ld3 = 969.1624886115637;
    Thought lo4 = Thought36.getInstance(fd0, fd1, ld3, fd0, fb0, fb1, lb1, lb2);
    fb0 = fb1 || lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
