package genetic;
import java.util.ArrayList;
class Thought1 extends Thought{
private static ArrayList<Thought1> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 333.4773527330106;
private double fd1 = 427.5928952258753;
private Thought fo0 = null;
private Thought fo1 = null;
Thought1 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought1 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought1 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought1 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought1 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought1 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought1 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought1 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought1 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought1 instance = new Thought1 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought1 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought1 instance = new Thought1 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought1 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought1 instance = new Thought1 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought1 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought1 instance = new Thought1 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought1 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought1 instance = new Thought1 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought1 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought1 instance = new Thought1 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought1 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought1 instance = new Thought1 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought1 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought1 instance = new Thought1 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    boolean lb0 = true;
    boolean lb1 = false;
    lb1 = fb0 || fb1;
    lb0 = fd1 < fd0;
    double ld2 = 897.2185447657035;
    Output.points[2][8] -= fd0;
    lb1 = fb0 || fb1;
    fd1 = ld2 + fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
}
    lb0 = fd1 > ld2;
if(fo1 != null){
      fo1.m3(lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld2, fd0, fd1);
}
    lb1 = fb0 || fb1;
    boolean lb3 = true;
    ld2 *= -1;
    if (lb0) {
        fd0 = fd1 - ld2;
        lb1 = fd0 < fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        ld2 = fd0 + fd1;
        Thought lo4 = Thought16.getInstance(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, lb3, fb0, fb1, lb0);
        fd0 *= -1;
        lb1 = lb3 && fb0;
        fd1 *= -1;
        boolean lb5 = true;
if(fo1 != null){
          fo1.m3(ld2, fd0, fd1, ld2, fb0, fb1, lb5, lb0);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0);
}
        fd1 = ld2 - fd0;
        lb1 = lb3 && fb0;
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
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    ab1 = !ab2;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo0.m3(ab4, fb0, fb1, ab1);
}
        fd0 *= -1;
    ab2 = ab3 && ab4;
    fb0 = fd1 > fd0;
    fb1 = ab1 && ab2;
    if (ab3) {
if(fo1 != null){
          ab4 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
        double ld0 = 865.9501984349556;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
        ab3 = !ab4;
        fb0 = fb1 && ab1;
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
        Thought lo1 = Thought5.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
        boolean lb2 = true;
        fd0 = fd1 - ld0;
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb0 = fb1 && lb2;
        ab1 = fd0 > fd1;
        ld0 *= -1;
        boolean lb3 = false;
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
    ad2 *= -1;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought6.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    boolean lb1 = false;
    ad4 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, lb1, fb0, fb1);
}
    ad2 = ad3 + ad4;
        boolean lb2 = true;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, lb1, lb2, lb3, fb0);
}
    boolean lb4 = true;
    Output.points[3][0] -= ad3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo0.m2();
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ab1 = !ab2;
    fd0 = fd1 - ad1;
    double ld0 = 940.4146555295615;
    ab3 = !ab4;
    fb0 = fb1 || ab1;
    ad1 = ad2 + ad3;
    ab2 = ab3 && ab4;

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
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    double ld0 = 472.22114927208577;
    double ld1 = 662.8551872525621;
if(ao1 != null){
      ao1.m1(fb1, fb0, fb1, fb0);
}
    fb1 = ld1 < fd0;
    boolean lb2 = true;
    double ld3 = 276.71883857374604;
    lb2 = fd0 < fd1;
    fb0 = !fb1;
    ld0 = ld1 + ld3;
    lb2 = fd0 > fd1;
    if (fb0) {
if(ao3 != null){
          ao2 = ao3.m4(ld0, ld1, ld3, fd0);
}
        boolean lb4 = false;
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
    ad1 *= -1;
    boolean lb0 = false;
    double ld1 = 942.2350328049741;
    lb0 = ad1 < ad2;
    ad3 = ad4 - fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    double ld2 = 94.25859787502691;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld1, ld2, ad1, ad2, fb0, fb1, lb0, fb0);
}
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
    lb0 = ld2 > ad1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb0 = fb1 || lb0;
    fb0 = fd1 > ld1;
    boolean lb3 = true;
    Thought lo4 = Thought6.getInstance();
    fb0 = ld2 > ad1;
    fb1 = lb0 || lb3;
    boolean lb5 = false;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, lb5, fb0, fb1, lb0);
}
    ad3 *= -1;
    Thought lo6 = Thought3.getInstance(lb3, lb5, fb0, fb1);
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld1, ld2);
}
    Thought lo7 = Thought13.getInstance(ao1, ao2, ao3, ao4);
    boolean lb8 = false;

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
    boolean lb0 = true;
    lb0 = !ab1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought9.getInstance(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
    boolean lb2 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    double ld3 = 230.22265934013532;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Thought lo4 = Thought0.getInstance(fb1, lb0, lb2, ab1);
if(ao2 != null){
      ao1 = ao2.m4(ld3, fd0, fd1, ld3);
}
    Thought lo5 = Thought1.getInstance(ao3, ao4, fo0, fo1);

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
    ad2 *= -1;
    ab2 = !ab3;
    ab4 = !fb0;
    Output.points[3][1] -= ad3;
    Thought lo0 = Thought13.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    boolean lb1 = true;
    fd1 = ad1 - ad2;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
    boolean lb2 = false;
    ad2 = ad3 - ad4;
    boolean lb3 = false;
if(ao1 != null){
      fo1 = ao1.m4();
}
    fd0 = fd1 + ad1;
    ad2 *= -1;

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
    double ld0 = 688.410908697638;
        ld0 = fd0 + fd1;
    boolean lb1 = false;
    ld0 = fd0 - fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
    Thought lo2 = Thought12.getInstance(fb1, lb1, fb0, fb1);
    double ld3 = 804.9717881249273;
    lb1 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
        if (lb1) {
            fb0 = fb1 || lb1;
if(fo1 != null){
              fo0 = fo1.m4(ld0, ld3, fd0, fd1);
}
if(fo0 != null){
              fo0.m2(fo1, fo0, fo1, fo0);
}
            boolean lb4 = false;
            double ld5 = 315.0994549442927;
            Output.points[3][2] -= ld5;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld3, fd0, fd1, lb1, fb0, fb1, lb4);
}
            lb1 = ld5 > ld0;
            fb0 = ld3 > fd0;
            fb1 = !lb4;
if(fo1 != null){
              fd1 = fo1.m3(ld5, ld0, ld3, fd0, lb1, fb0, fb1, lb4);
}
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m1();
}
    boolean lb0 = false;
    Thought lo1 = Thought5.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
if(fo1 != null){
      fd0 = fo1.m3(lb0, ab1, ab2, ab3);
}
    fd1 = fd0 - fd1;
    boolean lb2 = false;
    fd0 = fd1 + fd0;
    Thought lo3 = Thought15.getInstance(fd1, fd0, fd1, fd0);
    ab3 = fd1 > fd0;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb2);
}
    Thought lo4 = Thought13.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    fb0 = !fb1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    lb2 = ab1 && ab2;
    fd1 = fd0 - fd1;
    ab3 = fd0 > fd1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(fo0 != null){
      ad1 = fo0.m3();
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = ad3 < ad4;
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    boolean lb0 = false;
    fb0 = fd1 > ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought8.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
    ad4 = fd0 - fd1;
    lb0 = ad1 < ad2;
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
    ad1 = ad2 + ad3;
    fb1 = ad4 < fd0;
    for(int i0=0; i0<10; i0++){
        boolean lb2 = true;
        Output.points[3][3] -= fd1;
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
    ab2 = !ab3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    ab4 = fd0 > fd1;
if(fo1 != null){
      fo1.m1();
}
    double ld0 = 765.2429353169289;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    double ld1 = 27.119775781991905;
    ld1 = ad1 - ad2;
    ad3 *= -1;
if(fo1 != null){
      ad4 = fo1.m3(ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld1);
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    if (ab3) {
if(fo1 != null){
          ab4 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
        double ld2 = 342.05337240792767;
        ab3 = ab4 || fb0;
if(fo1 != null){
          fo0 = fo1.m4(ld0, ld1, ad1, ad2, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          ab4 = fo0.m2();
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fd0 *= -1;
    fb1 = fb0 || fb1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
    double ld0 = 561.641680049433;
    fd0 = fd1 - ld0;
if(ao2 != null){
          ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fd0 *= -1;
    fd1 = ld0 + fd0;
    fd1 = ld0 - fd0;
    if (fb1) {
        fb0 = fd1 < ld0;
        Thought lo1 = Thought0.getInstance(fd0, fd1, ld0, fd0);
        } else {
                boolean lb2 = true;
if(ao3 != null){
          fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1, fb1, lb2, fb0, fb1);
}
        Thought lo3 = Thought10.getInstance(ld0, fd0, fd1, ld0, lb2, fb0, fb1, lb2);
        fd0 = fd1 + ld0;
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
        fd1 *= -1;
        boolean lb4 = true;
        fb0 = fb1 && lb2;
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
if(ao1 != null){
      ao1.m2();
}
    double ld0 = 63.63017327846828;
    fb0 = fb1 || fb0;
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb1, fb0);
}
    ld0 = ad1 + ad2;
if(ao2 != null){
      ao2.m3(fb1, lb1, fb0, fb1);
}
    double ld2 = 845.2653815621475;
        lb1 = fb0 || fb1;
    lb1 = !fb0;
    fb1 = !lb1;
    boolean lb3 = false;
    ad2 = ad3 - ad4;
if(ao3 != null){
      lb3 = ao3.m2(fd0, fd1, ld0, ld2);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ab2 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      ab1 = ao1.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    Output.points[3][4] -= fd1;
    double ld0 = 305.89061405432;
    ld0 *= -1;
    Output.points[3][5] += fd0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ld0 = ao4.m3(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(ab4, fb0, fb1, ab1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    Output.points[3][6] -= ad2;
    ad3 = ad4 + fd0;
if(ao1 != null){
      ao1.m2(fd1, ad1, ad2, ad3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    double ld0 = 147.48903367973767;
    boolean lb1 = true;
    lb1 = ad3 > ad4;
    fd0 = fd1 + ld0;
    Thought lo2 = Thought8.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    Thought lo3 = Thought12.getInstance(fd0, fd1, ld0, ad1, fb0, fb1, lb1, ab1);
    ad2 *= -1;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 559.8411112460075;
    if (fb0) {
        Output.points[3][7] += ld0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    double ld0 = 828.5941307967328;
    boolean lb1 = false;
    Thought lo2 = Thought1.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    fb0 = fb1 || lb1;
if(fo1 != null){
      ld0 = fo1.m3(ab1, ab2, ab3, ab4);
}
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
    boolean lb4 = false;
    double ld5 = 291.1981485944524;
    ab3 = fd0 < fd1;
    ab4 = !fb0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb6 = false;
    ld0 *= -1;
    ld5 = fd0 + fd1;
    double ld7 = 45.353988977971106;
    Thought lo8 = Thought9.getInstance(fo1, fo0, fo1, fo0, ld0, ld5, ld7, fd0, fb0, fb1, lb1, lb3);
if(fo1 != null){
      fo1.m1(fd1, ld0, ld5, ld7, lb4, lb6, ab1, ab2);
}
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld5, ld7, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
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
    if (fb0) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        } else if (fb1) {
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
        Thought lo0 = Thought3.getInstance(ad2, ad3, ad4, fd0);
        Output.points[3][8] += fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        boolean lb1 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
}
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
    Thought lo0 = Thought4.getInstance(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = ad1 < ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
        Thought lo1 = Thought5.getInstance(ad4, fd0, fd1, ad1);
    Thought lo2 = Thought13.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = fd1 > ad1;
    double ld3 = 368.8820556488899;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld3, ab3, ab4, fb0, fb1);
}
    boolean lb4 = false;
    ad1 = ad2 + ad3;
    lb4 = ab1 && ab2;
    double ld5 = 705.0282466998686;
    ad3 = ad4 - fd0;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld3, ld5, ad1);
}
if(fo1 != null){
      ab4 = fo1.m2();
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    double ld0 = 577.4746455489474;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    ld0 = fd0 - fd1;
if(ao1 != null){
      fb0 = ao1.m2(fb1, fb0, fb1, fb0);
}
        Output.points[4][0] -= ld0;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld0, fd0, fd1);
}
    fb1 = fb0 && fb1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
    Thought lo1 = Thought5.getInstance(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
    double ld2 = 653.1275523722651;
    boolean lb3 = true;
if(fo1 != null){
      ld2 = fo1.m3(fd0, fd1, ld0, ld2, fb0, fb1, lb3, fb0);
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
    ad2 = ad3 + ad4;
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    Thought lo0 = Thought9.getInstance();
    boolean lb1 = true;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb1, fb0);
}
    ad1 *= -1;
    Thought lo2 = Thought0.getInstance(fb1, lb1, fb0, fb1);
    ad2 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}
    Output.points[4][1] += ad1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    ad2 *= -1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb1);
}
    fb0 = ad1 < ad2;
    ad3 = ad4 + fd0;
    boolean lb3 = false;
    boolean lb4 = true;
    Output.points[4][2] -= fd1;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, lb4, fb0, fb1, lb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(ao1 != null){
      lb3 = ao1.m2();
}
    lb4 = fb0 || fb1;
    lb1 = lb3 || lb4;
    double ld5 = 521.0651168346068;
    Thought lo6 = Thought18.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb1, lb3);

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
if(ao2 != null){
      ab1 = ao2.m2(ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
if(ao3 != null){
      ao3.m3(fd0, fd1, fd0, fd1);
}
    double ld0 = 682.8113661959505;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    ab1 = ld0 > fd0;
    boolean lb1 = false;
    double ld2 = 149.64119546198964;
    ab1 = fd0 > fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, ld2, fd0, fd1, ab2, ab3, ab4, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    Output.points[4][3] -= ad2;
if(ao2 != null){
      ad3 = ao2.m3(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    double ld0 = 337.7834845666159;
    boolean lb1 = true;
    boolean lb2 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    ab3 = ab4 && fb0;
    Output.points[4][4] -= fd0;
    boolean lb3 = false;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      ao4 = fo0.m4(lb3, ab1, ab2, ab3);
}
if(fo1 != null){
          fo1.m2(fd1, ld0, ad1, ad2);
}
    Output.points[4][5] += ad3;
    ad4 *= -1;
    fd0 = fd1 - ld0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb1);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld0, ad1, lb2, lb3, ab1, ab2);
}
    ab3 = ad2 > ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0);
}
    ab4 = ad1 < ad2;
    boolean lb4 = true;
    Thought lo5 = Thought12.getInstance();
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb1);
}
    double ld6 = 160.7479774910503;
    boolean lb7 = true;
    Output.points[4][6] += ad3;

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
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    boolean lb0 = true;
    Thought lo1 = Thought13.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fd0 < fd1;
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        fb1 = fd1 > fd0;
        lb0 = fd1 < fd0;
        fb0 = !fb1;
        lb0 = fd1 < fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
        fb1 = lb0 && fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        double ld2 = 72.95622789986263;
        fb1 = fd0 > fd1;
if(fo0 != null){
          fo1 = fo0.m4();
}
        lb0 = fb0 && fb1;
        boolean lb3 = false;
        lb3 = ld2 < fd0;
        }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;

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
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb0, ab1, ab2, ab3);
}
    Thought lo1 = Thought9.getInstance(fd0, fd1, fd0, fd1);
    boolean lb2 = false;
    if (ab3) {
        fd0 = fd1 - fd0;
        fd1 *= -1;
        Output.points[4][7] -= fd0;
        fd1 *= -1;
        double ld3 = 588.3061317959005;
        ab4 = fb0 || fb1;
        lb0 = lb2 && ab1;
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
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    fd0 = fd1 - ad1;
    for(int i0=0; i0<10; i0++){
        Output.points[4][8] -= ad2;
if(fo0 != null){
          fb1 = fo0.m2(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
        double ld0 = 210.02239519524989;
        boolean lb1 = true;
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
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    ab1 = ad3 < ad4;
    fd0 *= -1;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    Thought lo1 = Thought1.getInstance(fb1, lb0, ab1, ab2);
    boolean lb2 = false;

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
    fb1 = fd0 > fd1;
if(ao2 != null){
      ao2.m2(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd0 = fd1 - fd0;
    double ld0 = 321.7249689312432;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = ld0 > fd0;
    boolean lb1 = false;
    fd1 *= -1;
if(ao4 != null){
      ld0 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
}
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, lb1, fb0, fb1, lb1);
}
    ld0 = fd0 - fd1;
    Output.points[5][0] += ld0;
    fb0 = fb1 || lb1;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, fd0);
}

Thought.STACK_COUNTER++;
return ao1;
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = ad1 > ad2;
    fb1 = fb0 && fb1;
    double ld0 = 422.1088863433569;
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb1);
}
    fd1 = ld0 + ad1;
    fb0 = ad2 < ad3;
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ld0, ad1, fb1, lb1, fb0, fb1);
}
    lb1 = ad2 < ad3;
    boolean lb2 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao2 != null){
          fd1 = ao2.m3();
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    Output.points[5][1] -= fd1;
if(ao2 != null){
      fd0 = ao2.m3(fb0, fb1, lb0, ab1);
}
if(ao3 != null){
      ao3.m3(fd1, fd0, fd1, fd0);
}
    Output.points[5][2] -= fd1;
    ab2 = ab3 && ab4;
    fb0 = fb1 || lb0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ab2 = !ab3;
    ab4 = ad1 < ad2;
    fb0 = !fb1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought8.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
    ab3 = fd0 < fd1;
if(fo1 != null){
      ab4 = fo1.m2(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      ad1 = fo0.m3();
}
    fb1 = ad2 > ad3;
    double ld1 = 807.4640735258592;
if(fo1 != null){
      ad3 = fo1.m3(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
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
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
        Output.points[5][3] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    double ld1 = 319.6453900026436;
    boolean lb2 = false;
    boolean lb3 = true;
    ld1 = fd0 - fd1;
    double ld4 = 786.7333274026512;

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
    Thought lo0 = Thought15.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    Thought lo1 = Thought5.getInstance();
    fb1 = fb0 || fb1;
    fd1 *= -1;
    boolean lb2 = true;
    lb2 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
    fb1 = fd0 > fd1;
    lb2 = fd0 < fd1;
if(fo0 != null){
      fo0.m1(fb0, fb1, lb2, fb0);
}
    fb1 = !lb2;
    fb0 = fb1 && lb2;
    fb0 = !fb1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
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
    fb0 = fb1 && fb0;
    fd1 = fd0 - fd1;
    boolean lb0 = true;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    boolean lb1 = false;
    double ld2 = 260.0324980389367;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, fb1, lb0, lb1, fb0);
}
    Thought lo3 = Thought13.getInstance(fd1, ld2, fd0, fd1, fb1, lb0, lb1, fb0);
    fb1 = ld2 < fd0;
    lb0 = fd1 > ld2;
    lb1 = fb0 || fb1;
    fd0 = fd1 + ld2;
    lb0 = lb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
}
if(fo0 != null){
      fo0.m3();
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
