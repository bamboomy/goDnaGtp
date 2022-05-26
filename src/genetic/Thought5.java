package genetic;
import java.util.ArrayList;
class Thought5 extends Thought{
private static ArrayList<Thought5> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 45.298392181269946;
private double fd1 = 687.6460046203853;
private Thought fo0 = null;
private Thought fo1 = null;
Thought5 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought5 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought5 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought5 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought5 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought5 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought5 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought5 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought5 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought5 instance = new Thought5 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought5 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought5 instance = new Thought5 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought5 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought5 instance = new Thought5 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought5 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought5 instance = new Thought5 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought5 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought5 instance = new Thought5 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought5 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought5 instance = new Thought5 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought5 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought5 instance = new Thought5 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought5 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought5 instance = new Thought5 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo0 != null){
              fo0.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 || fb1;
    if (fb0) {
        boolean lb0 = false;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
        boolean lb1 = true;
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    double ld0 = 397.05520966355954;
    if (ab1) {
        boolean lb1 = true;
if(fo0 != null){
          fo1 = fo0.m4(ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
        fb0 = !fb1;
        double ld2 = 988.7812149605656;
if(fo1 != null){
          fo0 = fo1.m4();
}
        Output.points[6][2] -= ld2;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
}
if(fo0 != null){
          ab4 = fo0.m2(fb0, fb1, lb1, ab1);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
    Output.points[6][3] += ad1;
    Output.points[6][4] -= ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    ad1 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ad1 - ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    ad2 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    double ld0 = 135.62024492689912;
    fb0 = ld0 < ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[6][5] += ad2;
    ad3 = ad4 - fd0;
    fb1 = !fb0;
    double ld1 = 146.3172775016638;
    boolean lb2 = false;

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
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    boolean lb0 = false;
if(fo1 != null){
      fb0 = fo1.m2(fd1, ad1, ad2, ad3, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    boolean lb1 = false;
    double ld2 = 986.6748311134392;
if(fo0 != null){
      fo0.m1();
}
    ab2 = ab3 && ab4;
    ad1 = ad2 + ad3;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
    Thought lo3 = Thought6.getInstance(ab1, ab2, ab3, ab4);
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ld2, ad1);
}
    boolean lb4 = true;

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
    Output.points[6][6] -= fd0;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought13.getInstance(ao2, ao3, ao4, fo0);
    boolean lb1 = true;
    boolean lb2 = true;
    lb2 = !fb0;
    Thought lo3 = Thought10.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, lb1, lb2, fb0);
    fd0 = fd1 - fd0;
    Output.points[6][7] += fd1;
    fb1 = fd0 < fd1;
    lb1 = !lb2;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    if (fb1) {
        if (fb0) {
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
            fb1 = fb0 || fb1;
            Output.points[6][8] += fd0;
            Output.points[7][0] -= fd1;
if(fo0 != null){
              ao4 = fo0.m4();
}
            Output.points[7][1] -= ad1;
            boolean lb0 = true;
            ad2 = ad3 - ad4;
            boolean lb1 = false;
if(ao1 != null){
              fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb0, lb1, fb0, fb1);
}
            Thought lo2 = Thought10.getInstance(lb0, lb1, fb0, fb1);
            boolean lb3 = true;
if(fo1 != null){
              fo1.m2(fd0, fd1, ad1, ad2);
}
if(ao1 != null){
              ad3 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
              fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, lb0, lb1, lb3, fb0);
}
if(fo1 != null){
              ad2 = fo1.m3(ad3, ad4, fd0, fd1, fb1, lb0, lb1, lb3);
}
            Thought lo4 = Thought7.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
            fb0 = fd0 > fd1;
if(fo0 != null){
              fo0.m1();
}
            fb1 = lb0 || lb1;
if(fo1 != null){
              lb3 = fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb1);
}
            boolean lb5 = false;
if(fo1 != null){
              fo0 = fo1.m4(lb3, lb5, fb0, fb1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fd0 *= -1;
    double ld0 = 930.6729644039314;
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    Thought lo1 = Thought13.getInstance(fd0, fd1, ld0, fd0);
    boolean lb2 = false;
    fb0 = fb1 || lb2;
    fd1 *= -1;
    ld0 = fd0 + fd1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
        ld0 = fd0 - fd1;
    ld0 *= -1;
    ab1 = ab2 && ab3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0, ab4, fb0, fb1, lb2);
}
if(fo1 != null){
      ab1 = fo1.m2(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ld0 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
    lb2 = ab1 && ab2;
    Thought lo3 = Thought15.getInstance();
    ld0 = fd0 + fd1;
    ld0 = fd0 + fd1;
    ab3 = ab4 || fb0;
    Thought lo4 = Thought5.getInstance(ao1, ao2, ao3, ao4, fb1, lb2, ab1, ab2);
    boolean lb5 = false;
    ld0 = fd0 - fd1;
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
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
    ad1 = ad2 + ad3;
    double ld0 = 231.04883125952477;
        ad3 *= -1;
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ld0, ad1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ld0, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    boolean lb1 = false;
    ad4 *= -1;
    fd0 = fd1 + ld0;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    ab3 = ab4 && fb0;
if(ao2 != null){
      fd0 = ao2.m3();
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb0 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m2(fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
    Output.points[7][2] -= fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
}
        Output.points[7][3] += fd0;
        Output.points[7][4] -= fd1;
        fb1 = fd0 < fd1;
        fd0 = fd1 - fd0;
if(fo0 != null){
          fd1 = fo0.m3(fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ab2 = fd0 < fd1;
    boolean lb0 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || ab1;
    ab2 = ab3 && ab4;
    fb0 = fd1 < fd0;
    boolean lb1 = true;
        double ld2 = 407.27817009015365;
    fd0 = fd1 + ld2;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, lb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, fd0);
}

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
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m1(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought12.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
    double ld1 = 441.99897217314077;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ld1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m3(ad4, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;
    ad1 *= -1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
if(fo0 != null){
      fo0.m2();
}
    fd1 = ad1 - ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, ab1);
}
    ab2 = ad3 > ad4;
    ab3 = fd0 < fd1;
    Output.points[7][5] += ad1;
    boolean lb1 = true;
    ab3 = ad2 > ad3;
    if (ab4) {
        Thought lo2 = Thought16.getInstance(ad4, fd0, fd1, ad1);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fb0 = fb1 || lb0;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb1, ab1, ab2, ab3);
}
        Thought lo3 = Thought3.getInstance(fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
        lb1 = ab1 || ab2;
        ab3 = ad4 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
        if (ab4) {
            } else {
}}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao1 != null){
      fd1 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought14.getInstance(fb1, fb0, fb1, fb0);
if(ao2 != null){
      fb1 = ao2.m2(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fb1 = !fb0;
    if (fb1) {
        Thought lo1 = Thought9.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(ao1 != null){
          fd0 = ao1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        boolean lb2 = true;
        lb2 = !fb0;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd1 = ad1 - ad2;
    fb1 = fb0 && fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    Output.points[7][6] -= ad3;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
if(ao4 != null){
      fb0 = ao4.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
    fb0 = fd0 < fd1;
    Output.points[7][7] += ad1;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4);
}
    fb0 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fd1 *= -1;
    Output.points[7][8] += fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    double ld1 = 376.61409135180895;
    ab4 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld1);
}
    fb0 = fb1 && lb0;
if(ao4 != null){
      ao3 = ao4.m4();
}
    if (ab1) {
        fd0 = fd1 - ld1;
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          ao4 = fo0.m4(fb1, lb0, ab1, ab2);
}
        boolean lb2 = true;
        fd0 = fd1 + ld1;
if(fo1 != null){
          fo1.m2(fd0, fd1, ld1, fd0);
}
if(ao1 != null){
          fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    Output.points[8][0] -= ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    ad4 = fd0 + fd1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
}
    Output.points[8][1] -= fd0;
    ab4 = !fb0;
    fb1 = ab1 || ab2;
    Thought lo0 = Thought14.getInstance(ab3, ab4, fb0, fb1);
    ab1 = fd1 > ad1;
    ab2 = ad2 < ad3;
    double ld1 = 674.4463015835854;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    ab3 = ld1 < ad1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fd1 = fo0.m3(ld1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld1);
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
    boolean lb0 = true;
if(fo0 != null){
      fd1 = fo0.m3();
}
    fd0 = fd1 - fd0;
    Output.points[8][2] -= fd1;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
    fd0 = fd1 - fd0;
    lb0 = fb0 || fb1;
if(fo1 != null){
      lb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
    fd1 *= -1;

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
    ab1 = fd1 < fd0;
    double ld0 = 897.8062699217354;
    Output.points[8][3] += fd0;
    fd1 = ld0 + fd0;
    Thought lo1 = Thought16.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    boolean lb2 = true;
    ld0 = fd0 - fd1;
    Output.points[8][4] -= ld0;
if(fo0 != null){
      ab2 = fo0.m2(fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
    lb2 = fd1 > ld0;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    Output.points[8][5] += ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    double ld0 = 844.5257209801609;
    double ld1 = 222.8328961862095;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Output.points[8][6] -= ld0;
    ld1 = ad1 + ad2;
        ad3 = ad4 - fd0;
    fb1 = fb0 || fb1;
    fb0 = fd1 < ld0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought5.getInstance(ld1, ad1, ad2, ad3);
    fb1 = fb0 || fb1;
    Thought lo3 = Thought14.getInstance(fo1, fo0, fo1, fo0);
    Output.points[8][7] -= ad4;
    double ld4 = 382.8398643724574;
    ad4 *= -1;
    fd0 *= -1;
    fb0 = fd1 > ld0;
    fb1 = fb0 || fb1;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, ld4, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
}
    Thought lo5 = Thought18.getInstance(fo1, fo0, fo1, fo0, ld4, ad1, ad2, ad3);
    double ld6 = 372.2415892183851;
    fb0 = !fb1;
    Thought lo7 = Thought15.getInstance();
    boolean lb8 = false;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    ad2 = ad3 + ad4;
    fb0 = fb1 || ab1;
    for(int i0=0; i0<10; i0++){
        ab2 = !ab3;
        }
    ab4 = fb0 && fb1;
    fd0 = fd1 - ad1;
if(fo1 != null){
      ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    double ld1 = 999.3432563456125;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    boolean lb0 = true;
    fd0 = fd1 + fd0;
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    double ld1 = 392.1055763750256;
    fb0 = ld1 < fd0;
    fb1 = fd1 < ld1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    fd0 *= -1;
    Thought lo2 = Thought11.getInstance(ao1, ao2, ao3, ao4, fd1, ld1, fd0, fd1, lb0, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
    fd0 *= -1;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ld1, fd0, fd1);
}
        boolean lb3 = true;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ld1 = ao2.m3(ao3, ao4, fo0, fo1, lb0, lb3, fb0, fb1);
}
    boolean lb4 = true;
    boolean lb5 = true;
    Thought lo6 = Thought2.getInstance(lb0, lb3, lb4, lb5);
if(ao1 != null){
      fb0 = ao1.m2(fd0, fd1, ld1, fd0);
}
    fd1 *= -1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    ld1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld1, fd0, fb1, lb0, lb3, lb4);
}
if(ao1 != null){
      ao1.m2(fd1, ld1, fd0, fd1, lb5, fb0, fb1, lb0);
}
    boolean lb7 = false;
    lb3 = lb4 && lb5;

Thought.STACK_COUNTER++;
return ld1;
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    Output.points[8][8] -= fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ad1 = ao4.m3(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
        }
if(ao3 != null){
      ao3.m3(fb1, fb0, fb1, fb0);
}
        ad2 = ad3 - ad4;
    fb1 = fb0 && fb1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      ad3 = fo1.m3(ao1, ao2, ao3, ao4);
}
    fb0 = ad4 < fd0;
    Thought lo0 = Thought6.getInstance(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
if(ao3 != null){
      ao3.m3(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
    fb1 = !fb0;
    Thought lo1 = Thought13.getInstance();
    fb1 = fb0 || fb1;
    fb0 = fd1 > ad1;
    Thought lo2 = Thought2.getInstance(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
    boolean lb3 = true;
    ad2 *= -1;
    boolean lb4 = true;
    boolean lb5 = true;

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
    ab2 = ab3 && ab4;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    Output.points[0][0] += fd1;
    ab2 = fd0 > fd1;
    ab3 = fd0 < fd1;
    ab4 = fb0 && fb1;
    double ld1 = 948.0391559164128;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld1, lb0, ab1, ab2, ab3);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld1, fd0, ab4, fb0, fb1, lb0);
}
    boolean lb2 = false;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1);
}
    double ld3 = 857.9464101519758;
    boolean lb4 = false;
    boolean lb5 = true;
    Thought lo6 = Thought6.getInstance();
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb2, lb4, lb5, ab1);
}
        for(int i1=0; i1<10; i1++){
            ab2 = ld3 < fd0;
            boolean lb7 = true;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao1 != null){
      ao1.m3(ab1, ab2, ab3, ab4);
}
    ad1 = ad2 + ad3;
    ad4 *= -1;
    double ld0 = 539.9677452963291;
    double ld1 = 200.33834540611386;
    Output.points[0][1] += ad3;
    ad4 = fd0 + fd1;
    boolean lb2 = false;
    ld0 = ld1 + ad1;
    ad2 = ad3 + ad4;
    Output.points[0][2] -= fd0;
    ab4 = !fb0;
if(ao2 != null){
      ao2.m3(fd1, ld0, ld1, ad1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    ad2 = ad3 - ad4;
    fd0 = fd1 + ld0;

Thought.STACK_COUNTER++;
return ld1;
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
    Thought lo0 = Thought10.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    boolean lb1 = false;
    Thought lo2 = Thought9.getInstance(fd0, fd1, fd0, fd1);
    lb1 = fb0 || fb1;
    if (lb1) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        boolean lb3 = true;
        lb1 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb3, lb1);
}
if(fo0 != null){
          fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb3, lb1);
}
        fb0 = fd0 < fd1;
        fd0 *= -1;
        double ld4 = 485.61959676225257;
        } else if (lb1) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 - fd1;
        Thought lo5 = Thought18.getInstance();
        boolean lb6 = false;
        boolean lb7 = true;
        double ld8 = 656.1445251076832;
        ld8 *= -1;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fo0.m1(fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought7.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought1.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    boolean lb2 = false;
    fb0 = fb1 || lb2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab1 = fd1 > fd0;
if(fo0 != null){
      fo0.m1();
}
    fd1 = fd0 - fd1;
    Output.points[0][3] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(lb2, ab1, ab2, ab3);
}
    ab4 = !fb0;
    Thought lo3 = Thought16.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb2, ab1, ab2, ab3);
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
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    if (fb0) {
        fb1 = fd1 < ad1;
        ad2 = ad3 - ad4;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
          fo0.m3();
}
        Output.points[0][4] -= ad3;
        ad4 = fd0 - fd1;
        } else {
        double ld0 = 12.363352668157882;
        boolean lb1 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
          fo1.m2(fb0, fb1, lb1, fb0);
}
        boolean lb2 = false;
        ld0 = ad1 + ad2;
        ad3 = ad4 + fd0;
if(fo0 != null){
          fo0.m3(fd1, ld0, ad1, ad2);
}
        fb0 = !fb1;
        lb1 = ad3 < ad4;
        boolean lb3 = true;
        lb2 = lb3 && fb0;
        fb1 = !lb1;
        lb2 = lb3 || fb0;
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    double ld0 = 602.4982479409299;
    ab1 = ab2 || ab3;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
        fd0 = fd1 + ld0;
        double ld1 = 758.437460317946;
        ab2 = !ab3;
        ld0 *= -1;
        Thought lo2 = Thought5.getInstance(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
        fd0 = fd1 + ld1;
        Thought lo3 = Thought10.getInstance(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          ad4 = fo0.m3(fb1, ab1, ab2, ab3);
}
        fd0 *= -1;
        Output.points[0][5] += fd1;
        Thought lo4 = Thought18.getInstance(ld1, ld0, ad1, ad2);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        ad3 *= -1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    Thought lo0 = Thought2.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
        Thought lo1 = Thought13.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
    fb1 = fb0 && fb1;
    double ld2 = 891.8720796253953;
    Output.points[0][6] += ld2;
if(fo0 != null){
      ao4 = fo0.m4();
}
    fd0 = fd1 + ld2;
    Thought lo3 = Thought1.getInstance(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
if(ao4 != null){
      ao4.m2(fb0, fb1, fb0, fb1);
}
    boolean lb4 = false;
    lb4 = fd0 > fd1;
if(fo0 != null){
      fb0 = fo0.m2(ld2, fd0, fd1, ld2);
}
    fb1 = !lb4;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    Thought lo0 = Thought10.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    double ld1 = 995.8829713656927;
    boolean lb2 = false;
    fb0 = fb1 || lb2;
    fd0 = fd1 + ld1;
if(ao4 != null){
      ad1 = ao4.m3(ad2, ad3, ad4, fd0, fb0, fb1, lb2, fb0);
}
    Output.points[0][7] += fd1;
    ld1 = ad1 - ad2;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
        Thought lo3 = Thought16.getInstance();
if(fo0 != null){
          ld1 = fo0.m3(fo1, ao1, ao2, ao3, fb1, lb2, fb0, fb1);
}
        lb2 = ad1 < ad2;
        if (fb0) {
if(ao4 != null){
              ao4.m2(fb1, lb2, fb0, fb1);
}
            Thought lo4 = Thought1.getInstance(ad3, ad4, fd0, fd1);
            Thought lo5 = Thought5.getInstance(fo0, fo1, ao1, ao2);
            lb2 = ld1 < ad1;
            ad2 *= -1;
            ad3 = ad4 + fd0;
            fd1 *= -1;
            boolean lb6 = false;
            Thought lo7 = Thought13.getInstance(ao3, ao4, fo0, fo1, ld1, ad1, ad2, ad3, lb2, fb0, fb1, lb6);
            lb2 = fb0 || fb1;
if(ao2 != null){
              ao1 = ao2.m4(ad4, fd0, fd1, ld1, lb6, lb2, fb0, fb1);
}
}}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ab1 = !ab2;
    boolean lb0 = false;
    Output.points[0][8] += fd1;
    fd0 = fd1 - fd0;
    ab2 = !ab3;
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      ao1.m1();
}
    boolean lb1 = false;
    Thought lo2 = Thought16.getInstance(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
    Output.points[1][0] -= fd0;
    lb0 = lb1 || ab1;
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
    lb0 = lb1 || ab1;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    Output.points[1][1] -= fd1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb1, lb0, lb1, ab1);
}
    ab2 = fd0 > fd1;

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
    double ld0 = 475.6813431392518;
if(ao2 != null){
          ld0 = ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fb0 = ao1.m2(fb1, ab1, ab2, ab3);
}
    ad1 = ad2 - ad3;
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ld0, ad1);
}
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1);
}
    ad2 *= -1;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      ao1.m1(ld0, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;

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
    Output.points[1][2] -= fd0;
        fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Output.points[1][3] += fd0;
    Output.points[1][4] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
    boolean lb0 = false;
    double ld1 = 521.6320081435118;
    fd0 = fd1 + ld1;
    boolean lb2 = true;
    fd0 = fd1 - ld1;
    Thought lo3 = Thought6.getInstance();
    fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb0);
}
    double ld4 = 753.7033189197826;

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
        Output.points[1][5] += fd0;
    Thought lo0 = Thought14.getInstance(fd1, fd0, fd1, fd0);
    Output.points[1][6] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd0 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[1][7] -= fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    Output.points[1][8] += fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m3();
}
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought17.getInstance(fo1, fo0, fo1, fo0);
    Thought lo2 = Thought4.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
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
        fb0 = fd0 < fd1;
    fb1 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Output.points[2][0] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
        fd1 = fd0 - fd1;

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
