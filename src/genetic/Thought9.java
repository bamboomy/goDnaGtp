package genetic;
import java.util.ArrayList;
class Thought9 extends Thought{
private static ArrayList<Thought9> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 576.2761703876;
private double fd1 = 753.7006309449915;
private Thought fo0 = null;
private Thought fo1 = null;
Thought9 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought9 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought9 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought9 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought9 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought9 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought9 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought9 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought9 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought9 instance = new Thought9 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought9 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought9 instance = new Thought9 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought9 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought9 instance = new Thought9 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought9 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought9 instance = new Thought9 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought9 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought9 instance = new Thought9 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought9 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought9 instance = new Thought9 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought9 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought9 instance = new Thought9 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought9 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought9 instance = new Thought9 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fb1 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 738.2090996425961;
    fb0 = !fb1;
    Thought lo1 = Thought13.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
    fb0 = fd0 < fd1;
    double ld2 = 92.40202033991379;
    for(int i0=0; i0<10; i0++){
        fb1 = fb0 && fb1;
        ld0 *= -1;
        fb0 = ld2 < fd0;
        if (fb1) {
            fb0 = !fb1;
            double ld3 = 808.6996130051289;
if(fo1 != null){
              fo0 = fo1.m4();
}
            boolean lb4 = true;
            lb4 = fd0 < fd1;
if(fo0 != null){
              fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb4, fb0, fb1);
}
if(fo1 != null){
              lb4 = fo1.m2(fb0, fb1, lb4, fb0);
}
            boolean lb5 = true;
            Thought lo6 = Thought18.getInstance(ld3, ld0, ld2, fd0);
if(fo0 != null){
              fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
            fb0 = fb1 && lb4;
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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Output.points[2][8] += fd0;
    boolean lb0 = false;
    fb0 = !fb1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab4 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[3][0] -= fd0;
    ab4 = fb0 && fb1;
    double ld1 = 101.34261521480829;
    boolean lb2 = false;
    fd0 = fd1 + ld1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, lb2, ab1, ab2, ab3);
}
    fd1 = ld1 + fd0;
    ab4 = fd1 < ld1;

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
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    boolean lb0 = false;
    ad2 = ad3 + ad4;
    double ld1 = 223.17112391442222;
    fb0 = fb1 && lb0;
    fb0 = ad4 > fd0;
    fb1 = lb0 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, ld1, ad1, ad2, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;

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
      fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m1();
}
    Thought lo1 = Thought13.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo2 = Thought9.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1, fb1, lb0, ab1, ab2);
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
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought1.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
    fd0 *= -1;
    Thought lo1 = Thought3.getInstance();
    boolean lb2 = true;
    Output.points[3][1] += fd1;
    lb2 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb2, fb0, fb1, lb2);
}
    fd0 *= -1;
    boolean lb3 = true;
    fd1 *= -1;
        fd0 = fd1 - fd0;
    lb3 = fb0 && fb1;

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
if(ao1 != null){
      ao1.m2(fb0, fb1, fb0, fb1);
}
    ad2 = ad3 + ad4;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    Thought lo0 = Thought9.getInstance(ao4, fo0, fo1, ao1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    ad4 *= -1;
    fd0 *= -1;
if(ao2 != null){
      fd1 = ao2.m3(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought5.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    double ld0 = 199.32900429657394;
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    boolean lb1 = true;
if(ao1 != null){
      ld0 = ao1.m3();
}
    Thought lo2 = Thought12.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb1, ab1);
if(fo1 != null){
      fd0 = fo1.m3(ab2, ab3, ab4, fb0);
}
    fb1 = !lb1;
    double ld3 = 333.98308223859885;
    ab1 = !ab2;

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
    ab2 = ad1 > ad2;
if(ao1 != null){
      ab3 = ao1.m2(ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab4 = !fb0;
    fb1 = ab1 || ab2;
    boolean lb0 = false;
    ab2 = ad1 > ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao2.m1(ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      ad3 = ao2.m3();
}
    ab4 = fb0 && fb1;
        boolean lb1 = true;
    lb0 = lb1 && ab1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb0, lb1, ab1);
}
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ad1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
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
    Output.points[3][2] += fd1;
    Thought lo0 = Thought1.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;

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
    double ld0 = 531.8415867818164;
    ld0 = fd0 - fd1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    boolean lb1 = true;
    lb1 = ab1 && ab2;
    ab3 = !ab4;
    fd0 = fd1 - ld0;
    Thought lo2 = Thought5.getInstance(fd0, fd1, ld0, fd0, fb0, fb1, lb1, ab1);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    ab2 = ld0 > fd0;
if(fo1 != null){
      ab3 = fo1.m2();
}
    ab4 = fb0 || fb1;
    fd1 *= -1;
    ld0 = fd0 - fd1;
    lb1 = !ab1;
    ld0 = fd0 + fd1;
    ab2 = !ab3;
    ab4 = fb0 && fb1;
    lb1 = !ab1;

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
    fb1 = fb0 || fb1;
    Thought lo0 = Thought1.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    ad4 *= -1;
    Thought lo2 = Thought3.getInstance(fd0, fd1, ad1, ad2);
    lb1 = fb0 && fb1;
    lb1 = !fb0;
    fb1 = ad3 > ad4;
    fd0 *= -1;
    lb1 = fd1 < ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld3 = 721.8487739483281;
    boolean lb4 = false;
if(fo1 != null){
      lb4 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb1, lb4);
}
    fb0 = fd0 < fd1;
    boolean lb5 = false;
if(fo1 != null){
      fo0 = fo1.m4(ld3, ad1, ad2, ad3, fb0, fb1, lb1, lb4);
}

Thought.STACK_COUNTER++;
return lb5;
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
    ab2 = ab3 && ab4;
    Output.points[3][3] += ad1;
    double ld0 = 495.7906502810101;
    ad1 = ad2 - ad3;
    fb0 = !fb1;
    ab1 = ab2 && ab3;
    ab4 = !fb0;
    double ld1 = 628.4815313478645;
    ad3 *= -1;
    fb1 = ab1 && ab2;
    ab3 = ad4 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, ld1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab4 = fb0 || fb1;
    ab1 = ab2 || ab3;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    Thought lo0 = Thought8.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought2.getInstance(ao3, ao4, fo0, fo1);
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought3.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3();
}
    double ld3 = 704.5384255203013;
    Thought lo4 = Thought15.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    Thought lo5 = Thought18.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    ld3 *= -1;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld3, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, ld3, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ld3, fd0, fd1, ld3, fb0, fb1, fb0, fb1);
}
    double ld6 = 512.1862112494711;
    fb0 = !fb1;
    boolean lb7 = true;
    lb7 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld6, fd0, fd1, ld3);
}
    ld6 *= -1;

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
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad4 *= -1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 + ad2;
    double ld0 = 400.4124752741434;
    ad2 = ad3 - ad4;
    boolean lb1 = false;
if(ao3 != null){
      ao3.m2(lb1, fb0, fb1, lb1);
}
    fb0 = fd0 < fd1;
    fb1 = ld0 > ad1;
    lb1 = !fb0;
    boolean lb2 = true;
    ad2 *= -1;
    ad3 = ad4 - fd0;
if(ao4 != null){
      fd1 = ao4.m3(ld0, ad1, ad2, ad3);
}
    boolean lb3 = false;
    double ld4 = 765.3727535983717;
    lb3 = ad3 < ad4;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld4, fb0, fb1, lb1, lb2);
}
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4, lb3, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld0, ld4);
}
    boolean lb5 = true;
    boolean lb6 = true;

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
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    Thought lo1 = Thought18.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, ab1, ab2, ab3);
}
if(ao1 != null){
      ao1.m1(ab4, fb0, fb1, lb0);
}
    double ld2 = 921.1015031516299;
if(ao3 != null){
      ao2 = ao3.m4(ld2, fd0, fd1, ld2);
}
    boolean lb3 = false;
    lb3 = !ab1;
    boolean lb4 = false;
    boolean lb5 = true;
    fd0 = fd1 + ld2;
    fd0 *= -1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
    double ld6 = 667.0382548916258;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld2, ld6, lb5, ab1, ab2, ab3);
}
    Thought lo7 = Thought16.getInstance(fd0, fd1, ld2, ld6, ab4, fb0, fb1, lb0);
    fd0 = fd1 - ld2;
    ld6 *= -1;
    lb3 = fd0 < fd1;
    ld2 *= -1;

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
    ab2 = ad2 < ad3;
    Output.points[3][4] += ad4;
        Thought lo0 = Thought10.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
    Output.points[3][5] -= ad3;
if(fo0 != null){
      fo0.m2();
}
    boolean lb1 = true;
    ad4 = fd0 - fd1;
    ab2 = !ab3;
    double ld2 = 669.9146157737684;
    ld2 = ad1 + ad2;
    ad3 *= -1;
    ad4 *= -1;
if(fo1 != null){
      ab4 = fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, lb1, ab1);
}
    ab2 = fd0 > fd1;
    ld2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ad1, ad2, ad3, ad4);
}
    lb1 = ab1 && ab2;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    double ld3 = 260.88532541386076;
    Thought lo4 = Thought15.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld2, ab3, ab4, fb0, fb1);

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fd1 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        Output.points[3][6] -= fd0;
        fd1 = fd0 - fd1;
        boolean lb0 = false;
        lb0 = fd0 > fd1;
        fd0 = fd1 + fd0;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo1.m2();
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
        fb1 = fd1 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
        for(int i1=0; i1<10; i1++){
            fd1 = fd0 - fd1;
            fb0 = fb1 && lb0;
            }
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fb0 = fd1 < fd0;
        Thought lo1 = Thought19.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
        boolean lb2 = false;
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
    ab1 = fd0 > fd1;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    fb0 = fd0 < fd1;
    boolean lb1 = true;
    double ld2 = 87.90293117964319;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb3 = false;
    ld2 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, lb3, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(ab4, fb0, fb1, lb0);
}
    lb1 = !lb3;
if(fo1 != null){
      fo1.m2(ld2, fd0, fd1, ld2);
}
    fd0 = fd1 - ld2;
    boolean lb4 = false;
    fd0 = fd1 - ld2;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    if (lb4) {
        boolean lb5 = false;
        fd1 = ld2 - fd0;
        lb4 = fd1 > ld2;
        ab1 = ab2 && ab3;
        ab4 = !fb0;
        fb1 = lb5 || lb0;
        lb1 = lb3 && lb4;
        boolean lb6 = true;
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    Output.points[3][7] -= ad3;
        fb1 = ad4 > fd0;
    double ld0 = 120.90830462349163;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
}
    ad2 = ad3 + ad4;
    fb0 = fb1 || fb0;
    Thought lo1 = Thought3.getInstance();
        fd0 = fd1 + ld0;
    fb1 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb2 = false;
if(fo1 != null){
      ad3 = fo1.m3(lb2, fb0, fb1, lb2);
}
if(fo0 != null){
      fb0 = fo0.m2(ad4, fd0, fd1, ld0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb2);
}
    fb0 = fd1 > ld0;
if(fo1 != null){
              fo1.m2(ad1, ad2, ad3, ad4, fb1, lb2, fb0, fb1);
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
    double ld0 = 172.1443239483108;
    Thought lo1 = Thought0.getInstance(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
    ab1 = ab2 || ab3;
    ad4 *= -1;
    ab4 = fb0 || fb1;
    ab1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ld0 = fo0.m3(fb1, ab1, ab2, ab3);
}
    ab4 = ad1 > ad2;
    fb0 = fb1 || ab1;
    ab2 = ab3 && ab4;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld0);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab1 = ab2 || ab3;
        ad1 = ad2 - ad3;
    double ld2 = 100.54839852863728;
    ad3 *= -1;
    ab4 = ad4 > fd0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fd0 = fd1 - fd0;
    Thought lo0 = Thought14.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = fd1 < fd0;
    Output.points[3][8] += fd1;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld1 = 547.797925666992;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld1);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    fd0 = fd1 + ld1;
    fb1 = !fb0;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fd1 = ld1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld1, fd0, fd1);
}
    ld1 = fd0 + fd1;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
    fb0 = !fb1;
    boolean lb2 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1, lb2, fb0, fb1, lb2);
}
    fd0 = fd1 - ld1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld1, fd0, fb0, fb1, lb2, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    fb0 = fb1 && fb0;
if(ao2 != null){
      fb1 = ao2.m2();
}
    double ld0 = 321.8082200404901;
    fb0 = ad4 > fd0;
    double ld1 = 56.18288187925225;
    fb1 = fd0 < fd1;
    ld0 *= -1;
    ld1 = ad1 + ad2;
    ad3 = ad4 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    Output.points[4][0] -= fd1;
    Thought lo2 = Thought13.getInstance(fb0, fb1, fb0, fb1);
if(ao4 != null){
      ao3 = ao4.m4(ld0, ld1, ad1, ad2);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3);
}
    fb1 = ad3 > ad4;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ld1);
}
    boolean lb3 = true;
if(fo0 != null){
      ao4 = fo0.m4();
}
        ad1 = ad2 + ad3;
if(fo1 != null){
      ad4 = fo1.m3(ao1, ao2, ao3, ao4, lb3, fb0, fb1, lb3);
}
if(fo0 != null){
      fo0.m3(fb0, fb1, lb3, fb0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, ld0, ld1);
}
    Output.points[4][1] += ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo4 = Thought17.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb1, lb3, fb0, fb1);

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    double ld0 = 257.9226354757287;
    ld0 = fd0 + fd1;
    boolean lb1 = false;
    Thought lo2 = Thought10.getInstance(lb1, ab1, ab2, ab3);
    ab4 = !fb0;
    fb1 = ld0 > fd0;
if(ao2 != null){
      lb1 = ao2.m2(fd1, ld0, fd0, fd1);
}
    ab1 = !ab2;
    ab3 = ab4 && fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, fb1, lb1, ab1, ab2);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    boolean lb0 = true;
    ab1 = ab2 || ab3;
    Thought lo1 = Thought13.getInstance(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
    boolean lb2 = false;
    Output.points[4][2] += fd0;
    for(int i0=0; i0<10; i0++){
        double ld3 = 616.4510184195973;
        fd0 = fd1 - ld3;
if(ao2 != null){
          ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
          ao1 = ao2.m4();
}
        lb2 = !ab1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(fo0 != null){
      fd1 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fd0 = fd1 + fd0;
    fb0 = fb1 || fb0;
    fb1 = fd1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    boolean lb0 = false;
    boolean lb1 = false;
    fd0 *= -1;
    Thought lo2 = Thought4.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ab2 = fd1 < fd0;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      lb0 = fo0.m2();
}
    ab1 = !ab2;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    boolean lb1 = true;
if(fo0 != null){
      lb0 = fo0.m2(lb1, ab1, ab2, ab3);
}
    Thought lo2 = Thought12.getInstance(fd1, fd0, fd1, fd0);
    fd1 *= -1;
    ab4 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    double ld0 = 953.8528628600945;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[4][3] -= ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = ad3 < ad4;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    Output.points[4][4] -= fd1;

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
    ab2 = ad1 < ad2;
if(fo0 != null){
      ab3 = fo0.m2(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab4 = ad1 > ad2;
    Thought lo0 = Thought3.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
    double ld1 = 802.4125076909274;
    boolean lb2 = true;
        ab2 = ab3 || ab4;
    fb0 = fb1 || lb2;
    Thought lo3 = Thought4.getInstance(ld1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
    ad4 = fd0 + fd1;
    fb0 = fb1 || lb2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3);
}
    ab1 = ad4 < fd0;

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
    Thought lo0 = Thought14.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fb0 = ao1.m2(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao2.m1(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    fb1 = fd1 < fd0;
    fd1 *= -1;
    boolean lb2 = false;
    Thought lo3 = Thought2.getInstance(fd0, fd1, fd0, fd1, lb1, lb2, fb0, fb1);
    boolean lb4 = false;
    lb1 = !lb2;
    Output.points[4][5] += fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    boolean lb5 = false;
if(ao3 != null){
      ao2 = ao3.m4();
}
        fd1 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb4, lb5, fb0, fb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fb0 = fb1 || fb0;
    boolean lb0 = true;
    ad1 = ad2 + ad3;
    if (fb0) {
        ad4 *= -1;
if(ao1 != null){
          ao1.m2(fb1, lb0, fb0, fb1);
}
        Output.points[4][6] += fd0;
if(ao2 != null){
          ao2.m3(fd1, ad1, ad2, ad3);
}
        lb0 = ad4 < fd0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
          ao2 = ao3.m4(ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
        if (lb0) {
            fd1 = ad1 - ad2;
            Output.points[4][7] -= ad3;
            ad4 *= -1;
            fd0 = fd1 - ad1;
            } else {
            ad2 = ad3 + ad4;
            fd0 = fd1 + ad1;
            fb0 = fb1 || lb0;
            fb0 = fb1 || lb0;
if(ao4 != null){
              ao4.m2();
}
            Thought lo1 = Thought1.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
if(ao4 != null){
              ao3 = ao4.m4(fb1, lb0, fb0, fb1);
}
            lb0 = ad2 > ad3;
            fb0 = ad4 > fd0;
if(fo0 != null){
              fo0.m3(fd1, ad1, ad2, ad3);
}
}}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab1 = fd1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought0.getInstance(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    Thought lo1 = Thought11.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
    Output.points[4][8] += fd0;
if(ao1 != null){
      fo1 = ao1.m4(ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought2.getInstance(fd1, fd0, fd1, fd0);

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ab1 = ab2 || ab3;
    double ld0 = 456.2366411545047;
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0);
}
        double ld1 = 507.4937332047504;
    ld1 = ad1 - ad2;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
if(fo0 != null){
      ld0 = fo0.m3(ld1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld0);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m2();
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
          ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
        ld1 = ad1 - ad2;
        fb0 = fb1 && ab1;
        ad3 = ad4 - fd0;
        fd1 *= -1;
        ld0 = ld1 - ad1;
        ab2 = ad2 > ad3;
        double ld2 = 7.163475709627324;
        ab3 = ad3 < ad4;
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
    fd1 = fd0 + fd1;
    fb1 = fb0 || fb1;
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    fd1 *= -1;
    Thought lo1 = Thought2.getInstance(fd0, fd1, fd0, fd1);
    fb0 = fb1 || lb0;
    double ld2 = 90.70332814759415;
    ld2 = fd0 - fd1;
    boolean lb3 = false;
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, lb3, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, fd0, lb3, fb0, fb1, lb0);
}
    lb3 = fb0 && fb1;
    boolean lb4 = true;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, lb3, lb4, fb0, fb1);
}
    fd0 = fd1 + ld2;
if(fo1 != null){
      fd0 = fo1.m3(lb0, lb3, lb4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld2, fd0, fd1);
}
    fb1 = ld2 > fd0;
    boolean lb5 = true;
    fd1 *= -1;
    ld2 = fd0 + fd1;

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
    Thought lo0 = Thought7.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    double ld1 = 918.3472569208302;
    fb1 = ld1 > fd0;
    fb0 = fb1 && fb0;
    fd1 = ld1 + fd0;
    fd1 = ld1 - fd0;
    fd1 = ld1 - fd0;
    boolean lb2 = true;

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
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    boolean lb1 = true;
    Thought lo2 = Thought3.getInstance();
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    Output.points[5][0] += fd1;
    lb1 = !fb0;
    Output.points[5][1] += fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, lb1, fb0);
}
    fd0 *= -1;
    boolean lb3 = true;
    fd1 *= -1;
    fd0 = fd1 + fd0;
        fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
        boolean lb4 = false;
    lb4 = fd0 > fd1;
    Thought lo5 = Thought10.getInstance(fb0, fb1, lb0, lb1);
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
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
