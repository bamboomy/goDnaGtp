package genetic;
import java.util.ArrayList;
class Thought33 extends Thought{
private static ArrayList<Thought33> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 636.7719530939538;
private double fd1 = 492.52966364648057;
private Thought fo0 = null;
private Thought fo1 = null;
Thought33 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought33 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought33 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought33 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought33 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought33 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought33 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought33 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought33 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought33 instance = new Thought33 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought33 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought33 instance = new Thought33 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought33 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought33 instance = new Thought33 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought33 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought33 instance = new Thought33 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought33 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought33 instance = new Thought33 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought33 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought33 instance = new Thought33 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought33 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought33 instance = new Thought33 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought33 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought33 instance = new Thought33 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = !fb0;
        Output.points[2][0] -= fd0;
    fd1 = fd0 + fd1;
    fb1 = fb0 && fb1;
    Thought lo0 = Thought12.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    boolean lb1 = false;
    lb1 = fb0 || fb1;
    lb1 = fd0 > fd1;
    Thought lo2 = Thought66.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo3 = Thought0.getInstance(fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
    boolean lb4 = false;

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
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    Output.points[2][1] += fd1;
    ab1 = !ab2;
    boolean lb1 = true;
    double ld2 = 695.09563353555;
    ld2 *= -1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    lb0 = lb1 && ab1;
    ab2 = !ab3;
    Thought lo3 = Thought57.getInstance(fo0, fo1, fo0, fo1);
    ab4 = fd0 > fd1;
    Output.points[2][2] += ld2;
    fb0 = fd0 < fd1;
if(fo0 != null){
      ld2 = fo0.m3(fd0, fd1, ld2, fd0, fb1, lb0, lb1, ab1);
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
    double ld0 = 641.9489297954058;
    ld0 = ad1 + ad2;
    double ld1 = 672.332040478948;
    ad2 *= -1;
    fb1 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m1();
}
        double ld2 = 13.560272775491846;
if(fo0 != null){
          ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
        fb0 = ld2 < ld0;
        fb1 = fb0 || fb1;
        fb0 = fb1 || fb0;
        boolean lb3 = true;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb3, fb0);
}
        ld1 *= -1;
        double ld4 = 878.2373802037426;
        for(int i1=0; i1<10; i1++){
            fb1 = ld1 < ad1;
            boolean lb5 = false;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
            lb5 = lb3 || fb0;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld2, ld4, ld0, fb1, lb5, lb3, fb0);
}
if(fo1 != null){
              ld1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb5, lb3, fb0);
}
            fb1 = !lb5;
            Thought lo6 = Thought89.getInstance(fo0, fo1, fo0, fo1);
            double ld7 = 414.01183315500947;
            ld1 *= -1;
            double ld8 = 716.6085374600858;
            lb3 = fb0 && fb1;
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        ad2 *= -1;
        Thought lo0 = Thought18.getInstance(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
        fb0 = ad1 > ad2;
if(fo0 != null){
          ad3 = fo0.m3();
}
if(fo1 != null){
          ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
          fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
        if (ab4) {
            double ld1 = 692.5588737435337;
            fb0 = !fb1;
            ad2 = ad3 + ad4;
            fd0 = fd1 + ld1;
            ab1 = ad1 > ad2;
            ad3 = ad4 - fd0;
if(fo0 != null){
              fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2);
}
            ab2 = ad3 > ad4;
            ab3 = fd0 < fd1;
if(fo1 != null){
              fo1.m1(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
if(ao3 != null){
      fd1 = ao3.m3();
}
    Thought lo1 = Thought38.getInstance(fd0, fd1, fd0, fd1);
if(ao4 != null){
      ao4.m1(fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      fb1 = ao3.m2(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    Thought lo2 = Thought78.getInstance();
if(ao4 != null){
      ao4.m2(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
if(fo0 != null){
      fb1 = fo0.m2(lb0, fb0, fb1, lb0);
}
    fd1 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        boolean lb3 = false;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, lb3, lb0, fb0, fb1);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, ao1, ao2, ao3, lb3, lb0, fb0, fb1);
}
        Output.points[2][3] -= fd0;
if(ao4 != null){
          lb3 = ao4.m2(fo0, fo1, ao1, ao2);
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
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
if(ao1 != null){
      ao1.m2(fb1, fb0, fb1, fb0);
}
        Output.points[2][4] -= ad4;
    boolean lb0 = true;
    fb0 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
    ad3 *= -1;
    if (fb0) {
if(ao1 != null){
          fb1 = ao1.m2(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        double ld1 = 373.8015603848988;
        boolean lb2 = false;
        Thought lo3 = Thought99.getInstance(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb2);
        lb0 = ld1 > ad1;
        fb0 = ad2 > ad3;
if(ao1 != null){
          fo1 = ao1.m4();
}
        ad4 = fd0 + fd1;
        boolean lb4 = true;
        Thought lo5 = Thought45.getInstance(ld1, ad1, ad2, ad3);
if(ao2 != null){
          ao2.m2(fb0, fb1, lb2, lb4);
}
        Output.points[2][5] += ad4;
        fd0 = fd1 + ld1;
if(ao3 != null){
          ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
        boolean lb6 = true;
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
    fd0 *= -1;
    ab1 = ab2 || ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    fd1 = fd0 - fd1;
    ab2 = fd0 < fd1;
    ab3 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    fd0 *= -1;
    double ld0 = 113.35707414777379;
    Output.points[2][6] -= fd0;
    ab2 = ab3 || ab4;
    Thought lo1 = Thought38.getInstance(ao2, ao3, ao4, fo0);
    fb0 = fb1 && ab1;
    ab2 = ab3 && ab4;
    fb0 = fd1 < ld0;

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
if(ao2 != null){
      ao2.m1(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      fb1 = fo0.m2(fd1, ad1, ad2, ad3);
}
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought65.getInstance(ab1, ab2, ab3, ab4);
        double ld1 = 391.9285106330893;
        boolean lb2 = true;
        Thought lo3 = Thought45.getInstance(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
        boolean lb4 = false;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
        Thought lo5 = Thought91.getInstance(ao4, fo0, fo1, ao1, lb2, lb4, ab1, ab2);
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        Thought lo6 = Thought25.getInstance(ad4, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
        lb2 = !lb4;
        }
    ad2 *= -1;
    ad3 = ad4 - fd0;
    ab3 = ab4 && fb0;
    fd1 *= -1;
if(ao2 != null){
      ad1 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0);
}
    double ld7 = 492.9824927792187;
    boolean lb8 = false;
    Thought lo9 = Thought98.getInstance(fb0, fb1, lb8, ab1);
    fd0 = fd1 - ld7;
    boolean lb10 = false;

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
    fb0 = fb1 || fb0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    double ld0 = 413.281295624354;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
        ld0 = fd0 + fd1;
        ld0 = fd0 - fd1;
        }
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo1 = Thought91.getInstance(fd0, fd1, ld0, fd0);
    Thought lo2 = Thought0.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    boolean lb3 = false;
    boolean lb4 = true;
    lb3 = !lb4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb3, lb4);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb1, lb3, lb4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought6.getInstance(fd0, fd1, fd0, fd1);
    Thought lo1 = Thought86.getInstance(ab1, ab2, ab3, ab4);
    fb0 = fb1 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab2 = !ab3;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    for(int i0=0; i0<10; i0++){
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    Output.points[2][7] += ad1;
    boolean lb0 = false;
    boolean lb1 = true;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    for(int i0=0; i0<10; i0++){
        ad1 = ad2 - ad3;
if(fo0 != null){
          fo0.m1(ad4, fd0, fd1, ad1);
}
        lb1 = fb0 || fb1;
        boolean lb2 = true;
if(fo1 != null){
          fo1.m2(lb2, lb0, lb1, fb0);
}
        ad2 = ad3 - ad4;
        fd0 = fd1 - ad1;
        Output.points[2][8] += ad2;
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb0 = fb1 && ab1;
        boolean lb0 = true;
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
    fd1 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab2 = ad3 < ad4;

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
    double ld0 = 348.1408063520842;
if(ao1 != null){
      ao1.m2(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    Thought lo1 = Thought40.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(ld0, fd0, fd1, ld0);
}
    double ld2 = 899.3573299973544;
if(ao4 != null){
      ao4.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      ld2 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ld2);
}
    Thought lo3 = Thought93.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld2, fb1, fb0, fb1, fb0);
    fd0 = fd1 + ld0;

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
    boolean lb0 = true;
    Thought lo1 = Thought72.getInstance(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
    fb0 = ad2 > ad3;
    Thought lo2 = Thought76.getInstance(fo1, ao1, ao2, ao3);
    Thought lo3 = Thought84.getInstance(ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
    double ld4 = 401.6121839771498;
    lb0 = ad1 < ad2;
    ad3 = ad4 + fd0;
    fd1 *= -1;
    fb0 = fb1 || lb0;
    Output.points[3][0] -= ld4;
    ad1 = ad2 + ad3;
    double ld5 = 869.5728479029129;
    fb0 = ad3 > ad4;
    fb1 = lb0 || fb0;
    boolean lb6 = true;
    double ld7 = 722.9520949281938;
    fb0 = fb1 && lb0;
    Output.points[3][1] += ad4;
if(ao4 != null){
      ao4.m1();
}
    lb6 = fb0 && fb1;
    lb0 = !lb6;
    fb0 = fb1 || lb0;

Thought.STACK_COUNTER++;
return lb6;
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
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
if(ao4 != null){
      ao3 = ao4.m4(lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
    Thought lo1 = Thought95.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
    ab1 = fd0 > fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb2 = true;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb2);
}
    double ld3 = 785.933204015129;
    boolean lb4 = false;
    ld3 = fd0 + fd1;
    boolean lb5 = false;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4();
}
if(ao4 != null){
          ao4.m1(ld3, fd0, fd1, ld3);
}
        boolean lb6 = false;
        boolean lb7 = true;
}
Thought.STACK_COUNTER++;
return lb4;
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
      ab2 = ao1.m2(ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    double ld0 = 49.83903551394557;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    Output.points[3][2] += ad3;
if(ao1 != null){
      ao1.m2(ad4, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb1 = false;
    ab2 = ad1 < ad2;
    boolean lb2 = false;
if(ao4 != null){
      ab2 = ao4.m2(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo0.m3(ab3, ab4, fb0, fb1);
}
    boolean lb3 = true;
    Thought lo4 = Thought60.getInstance(fo1, ao1, ao2, ao3, ld0, ad1, ad2, ad3);
    lb1 = !lb2;
    double ld5 = 712.0373920386162;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    boolean lb1 = true;
    double ld2 = 11.854802541764583;
    lb0 = !lb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2, fb1, lb0, lb1, fb0);
}
    Thought lo3 = Thought67.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, lb1, fb0);
    fb1 = lb0 || lb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fd1 > ld2;
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld2, fd0, fd1, fb1, lb0, lb1, fb0);
}
        ld2 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb1 = ld2 > fd0;
        Thought lo4 = Thought13.getInstance(fd1, ld2, fd0, fd1);
        ld2 = fd0 - fd1;
        ld2 = fd0 - fd1;
        ld2 = fd0 - fd1;
        Output.points[3][3] -= ld2;
if(fo0 != null){
          fo0.m1(lb0, lb1, fb0, fb1);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
}
        lb0 = lb1 || fb0;
        if (fb1) {
            boolean lb5 = true;
}}
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
    ab1 = ab2 || ab3;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 - fd1;
    double ld0 = 222.44333900315704;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          ab1 = fo0.m2(ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    boolean lb1 = false;
    lb1 = ld0 > fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}

Thought.STACK_COUNTER++;
return ld0;
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
    ad2 = ad3 + ad4;
        Thought lo0 = Thought14.getInstance(fb1, fb0, fb1, fb0);
    fd0 = fd1 - ad1;
    double ld1 = 413.68854534396945;
    fb1 = !fb0;
    Output.points[3][4] -= ad1;
    if (fb1) {
        ad2 = ad3 - ad4;
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
              fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1);
}
if(fo0 != null){
              ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
            ld1 = ad1 + ad2;
            fb1 = !fb0;
            boolean lb2 = false;
            ad3 = ad4 - fd0;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
            fb1 = !lb2;
}}
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    ab2 = ad4 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    if (ab1) {
        ab2 = fd0 > fd1;
        boolean lb0 = false;
        ab2 = ad1 > ad2;
        ad3 = ad4 - fd0;
if(fo0 != null){
          fo0.m1();
}
        Output.points[3][5] -= fd1;
        double ld1 = 301.74661092268684;
if(fo1 != null){
          fo1.m3(ld1, ad1, ad2, ad3);
}
        ab3 = !ab4;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    fd1 *= -1;
    boolean lb0 = false;
        lb0 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(lb0, fb0, fb1, lb0);
}
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    Thought lo1 = Thought47.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
    fb1 = fd0 > fd1;
    boolean lb2 = false;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, lb0, lb2, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, lb0, lb2, fb0, fb1);
}
    fd1 = fd0 + fd1;
    lb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    lb2 = fd0 > fd1;
    fd0 = fd1 + fd0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4();
}
    lb0 = fb0 || fb1;
    lb0 = fb0 && fb1;
if(fo0 != null){
      ao4 = fo0.m4(fd1, ad1, ad2, ad3);
}
    lb0 = !fb0;
    if (fb1) {
if(ao1 != null){
          fo1 = ao1.m4(lb0, fb0, fb1, lb0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
}
Thought.STACK_COUNTER++;
return ad2;
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
    Thought lo0 = Thought87.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    if (fb1) {
if(fo1 != null){
          fd0 = fo1.m3(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        Thought lo1 = Thought50.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
        ab3 = ab4 && fb0;
        Output.points[3][6] += fd1;
        fd0 = fd1 - fd0;
if(fo1 != null){
          fo0 = fo1.m4();
}
        fd1 *= -1;
        Thought lo2 = Thought89.getInstance(fd0, fd1, fd0, fd1);
        fd0 = fd1 - fd0;
        Thought lo3 = Thought24.getInstance(fb1, ab1, ab2, ab3);
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
        fd0 = fd1 - fd0;
        double ld4 = 103.42140492515276;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld4, fd0, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
        fd1 = ld4 - fd0;
        fd1 *= -1;
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0);
}
        boolean lb5 = true;
        ld4 = fd0 - fd1;
        Output.points[3][7] += ld4;
        fb0 = fb1 || lb5;
        boolean lb6 = false;
        boolean lb7 = true;
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
    Thought lo0 = Thought52.getInstance(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    fb1 = ab1 && ab2;
    fd0 = fd1 + ad1;
if(ao2 != null){
      ad2 = ao2.m3();
}
if(ao3 != null){
      ab3 = ao3.m2(ad3, ad4, fd0, fd1);
}
    ab4 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ao4 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          ad1 = fo1.m3(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
        fb0 = fd1 > ad1;
        fb1 = ab1 && ab2;
        if (ab3) {
            Output.points[3][8] += ad2;
            ab4 = ad3 > ad4;
if(fo0 != null){
              fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
              ab3 = ao4.m2(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
              ab2 = ao3.m2(ao4, fo0, fo1, ao1);
}
            ad3 = ad4 - fd0;
if(ao3 != null){
              ao2 = ao3.m4(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
            ad4 *= -1;
            ab1 = !ab2;
            Output.points[4][0] += fd0;
if(ao4 != null){
              fd1 = ao4.m3();
}
            Output.points[4][1] += ad1;
            ab3 = ab4 || fb0;
            Thought lo1 = Thought22.getInstance(ad2, ad3, ad4, fd0);
if(fo1 != null){
              fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
            boolean lb2 = true;
            } else {
}}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    boolean lb1 = false;
    Output.points[4][2] += fd1;
    if (fb0) {
        double ld2 = 782.7495167026402;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ab1 = ab2 && ab3;
    boolean lb1 = false;
    boolean lb2 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || lb1;
        Output.points[4][3] -= fd1;
    lb2 = fd0 < fd1;
    double ld3 = 586.8404273724395;
    Thought lo4 = Thought17.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld3, fd0, fd1, ld3, lb0, lb1, lb2, ab1);
}
    for(int i0=0; i0<10; i0++){
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
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad2 *= -1;
    ad3 *= -1;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ad4 = fd0 - fd1;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    if (ab1) {
        ad1 *= -1;
        ab2 = ad2 < ad3;
        ab3 = ad4 > fd0;
if(fo1 != null){
          fo1.m1(fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
        boolean lb0 = true;
        double ld1 = 419.70551332742895;
        ad3 = ad4 - fd0;
if(fo0 != null){
          ab1 = fo0.m2();
}
        ab2 = ab3 || ab4;
        fb0 = fb1 && lb0;
        fd1 = ld1 + ad1;
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
        boolean lb2 = true;
        boolean lb3 = false;
if(fo1 != null){
          fd1 = fo1.m3(lb2, lb3, ab1, ab2);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3);
}
        boolean lb4 = false;
        Thought lo5 = Thought12.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb2, lb3);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (fb1) {
        boolean lb0 = false;
        fd1 = fd0 - fd1;
        double ld1 = 25.07663025100354;
        lb0 = fb0 && fb1;
        ld1 = fd0 - fd1;
        boolean lb2 = true;
if(ao2 != null){
          ld1 = ao2.m3(fd0, fd1, ld1, fd0, lb0, lb2, fb0, fb1);
}
        fd1 = ld1 - fd0;
        lb0 = lb2 || fb0;
        fd1 *= -1;
        ld1 = fd0 - fd1;
        boolean lb3 = false;
        fb0 = fb1 || lb0;
if(ao4 != null){
          ao3 = ao4.m4();
}
        Output.points[4][4] += ld1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
if(ao1 != null){
          ao1.m2(lb2, lb3, fb0, fb1);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    if (fb0) {
        fb1 = !fb0;
        fd0 *= -1;
        boolean lb0 = false;
if(fo1 != null){
          fd1 = fo1.m3(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, fb1, lb0, fb0, fb1);
}
        Output.points[4][5] -= fd0;
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
        double ld1 = 26.02348289438215;
        ld1 *= -1;
        lb0 = ad1 > ad2;
if(ao3 != null){
          ao3.m2(ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
        ld1 = ad1 - ad2;
if(ao4 != null){
          ao4.m2();
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought51.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      fd0 = ao2.m3(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && ab1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
    boolean lb2 = false;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    fd0 = fd1 - fd0;
    ab3 = !ab4;
    double ld3 = 318.8076226873893;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld3, fd0, fb0, fb1, lb1, lb2);
}
    fd1 = ld3 + fd0;
if(ao2 != null){
      fd1 = ao2.m3();
}
    if (ab1) {
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
        ab2 = !ab3;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    boolean lb0 = false;
if(fo0 != null){
      ao4 = fo0.m4(ab3, ab4, fb0, fb1);
}
    lb0 = ab1 && ab2;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    Thought lo1 = Thought61.getInstance(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
    Thought lo2 = Thought85.getInstance(ao3, ao4, fo0, fo1, lb0, ab1, ab2, ab3);
if(ao1 != null){
          ab4 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3, fb0, fb1, lb0, ab1);
}
if(ao1 != null){
      ao1.m3();
}
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ad1, ad2);
}
    if (ab2) {
        boolean lb3 = true;
        ab2 = ad3 < ad4;
        ab3 = ab4 || fb0;
if(ao3 != null){
          fb1 = ao3.m2(lb3, lb0, ab1, ab2);
}
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
    fd0 = fd1 + fd0;
    fb0 = fb1 || fb0;
    fb1 = fd1 < fd0;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
    fd1 = fd0 + fd1;
    lb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
    lb1 = fd0 > fd1;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
    lb0 = lb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld2 = 359.5105839059282;

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
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought3.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fd1 > fd0;
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld1 = 359.5255595105814;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, lb2, fb0, fb1, lb2);
}
    Output.points[4][6] += fd1;
    fb0 = fb1 && lb2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
    fb1 = lb2 || fb0;
    Thought lo3 = Thought24.getInstance(fo0, fo1, fo0, fo1);
    Thought lo4 = Thought49.getInstance(ld1, fd0, fd1, ld1, fb1, lb2, fb0, fb1);
    lb2 = fd0 > fd1;
    double ld5 = 493.7149380501748;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb2 = !fb0;
    double ld6 = 412.886872357925;
if(fo1 != null){
      fo0 = fo1.m4(ld1, ld5, ld6, fd0);
}
    fd1 *= -1;
    double ld7 = 361.5316448443843;
    fb1 = ld1 < ld5;
if(fo0 != null){
          ld6 = fo0.m3(lb2, fb0, fb1, lb2);
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
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld0 = 203.87173609405048;
    boolean lb1 = true;
    double ld2 = 126.96170898800594;
    double ld3 = 520.6789943788666;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld2, ld3, fd0, fd1, lb1, fb0, fb1, lb1);
}
    fb0 = ld0 < ld2;
    fb1 = lb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
    ld3 = fd0 + fd1;
    lb1 = fb0 || fb1;
    lb1 = fb0 || fb1;
    ld0 = ld2 + ld3;
    lb1 = fd0 < fd1;
    ld0 *= -1;
    fb0 = ld2 > ld3;
    boolean lb4 = true;
    fb0 = fb1 && lb1;
    fd0 = fd1 - ld0;
    double ld5 = 879.7756751383506;
    boolean lb6 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ld2 = fo1.m3(ld3, ld5, fd0, fd1, lb4, lb6, fb0, fb1);
}
    double ld7 = 78.95669602154217;
    lb1 = !lb4;
    Thought lo8 = Thought0.getInstance();
    Output.points[4][7] -= ld0;
if(fo1 != null){
      fo0 = fo1.m4(ld2, ld3, ld5, ld7);
}
    Thought lo9 = Thought15.getInstance(lb6, fb0, fb1, lb1);

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
