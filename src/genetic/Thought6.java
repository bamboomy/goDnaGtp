package genetic;
import java.util.ArrayList;
class Thought6 extends Thought{
private static ArrayList<Thought6> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 940.2551860653299;
private double fd1 = 628.3538178415298;
private Thought fo0 = null;
private Thought fo1 = null;
Thought6 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought6 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought6 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought6 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought6 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought6 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought6 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought6 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought6 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought6 instance = new Thought6 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought6 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought6 instance = new Thought6 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought6 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought6 instance = new Thought6 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought6 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought6 instance = new Thought6 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought6 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought6 instance = new Thought6 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought6 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought6 instance = new Thought6 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought6 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought6 instance = new Thought6 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought6 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought6 instance = new Thought6 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 + fd0;
    Thought lo0 = Thought8.getInstance(fd1, fd0, fd1, fd0);
    fb0 = !fb1;
    Thought lo1 = Thought18.getInstance(fo1, fo0, fo1, fo0);
    fd1 = fd0 - fd1;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought17.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    double ld3 = 863.879659435733;
    fb0 = fb1 || fb0;
    fb1 = ld3 > fd0;
if(fo0 != null){
      fo0.m2(fd1, ld3, fd0, fd1);
}
    ld3 = fd0 + fd1;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought9.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    double ld1 = 949.6527122596898;
    ld1 = fd0 + fd1;
    boolean lb2 = true;
if(fo1 != null){
          ld1 = fo1.m3(fd0, fd1, ld1, fd0, ab4, fb0, fb1, lb2);
}
    fd1 = ld1 - fd0;
    ab1 = fd1 < ld1;
    double ld3 = 856.2792260447136;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld1);
}
    double ld4 = 767.761935978306;

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
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    for(int i0=0; i0<10; i0++){
        ad3 = ad4 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
        ad4 = fd0 + fd1;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
        Thought lo0 = Thought5.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
        Output.points[2][1] -= fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
        boolean lb1 = false;
        ad2 = ad3 + ad4;
        Thought lo2 = Thought0.getInstance();
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(lb1, fb0, fb1, lb1);
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    double ld0 = 89.33455241524241;
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ad1, ad2, ad3);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
    if (ab4) {
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
        } else {
if(fo0 != null){
          ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
}
        Thought lo1 = Thought16.getInstance();
        double ld2 = 744.8798529520948;
        ab2 = !ab3;
        ad1 = ad2 + ad3;
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
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
    Thought lo0 = Thought15.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
if(ao1 != null){
      fb1 = ao1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld1 = 213.62374701747424;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1);
}
if(ao2 != null){
      fd0 = ao2.m3();
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;

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
    fb0 = fb1 && fb0;
    ad1 *= -1;
    ad2 = ad3 + ad4;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          fd0 = ao2.m3(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
          fd1 = ao3.m3(ad1, ad2, ad3, ad4);
}
        fd0 *= -1;
        Thought lo0 = Thought4.getInstance(ao4, fo0, fo1, ao1);
        Thought lo1 = Thought13.getInstance(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
if(ao1 != null){
          fo1 = ao1.m4(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        if (fb0) {
            boolean lb2 = false;
            double ld3 = 264.7958591846467;
            double ld4 = 187.37972762515412;
            fb0 = ld4 > ad1;
            fb1 = lb2 && fb0;
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
            fb1 = lb2 || fb0;
            fd1 = ld3 - ld4;
            fb1 = !lb2;
if(ao3 != null){
              ao2 = ao3.m4();
}
            ad1 *= -1;
            boolean lb5 = false;
            lb5 = fb0 || fb1;
            ad2 *= -1;
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
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fd0 = ao1.m3(fb0, fb1, ab1, ab2);
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
        boolean lb0 = true;
    ab2 = fd0 > fd1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
        fd1 = fd0 - fd1;
    fd0 *= -1;
    boolean lb1 = false;
    Thought lo2 = Thought0.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    fd1 = fd0 - fd1;
    boolean lb3 = false;
    fb0 = fd0 < fd1;
    Thought lo4 = Thought10.getInstance(fd0, fd1, fd0, fd1, fb1, lb0, lb1, lb3);

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
    ad3 = ad4 - fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    ab3 = ab4 || fb0;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, ab1);
}
    fd0 *= -1;
if(ao3 != null){
      ab2 = ao3.m2(fd1, ad1, ad2, ad3);
}
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao3.m3(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    boolean lb0 = true;
    fb0 = !fb1;
    fd1 = ad1 - ad2;
if(ao3 != null){
      ao3.m3();
}
    boolean lb1 = true;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
          fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    fb1 = !fb0;
    boolean lb0 = false;
    Output.points[2][2] -= fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && lb0;
    fb0 = fd1 > fd0;
    fb1 = !lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 - fd1;
    Output.points[2][3] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;

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
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        for(int i1=0; i1<10; i1++){
if(fo1 != null){
              fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
              fo0 = fo1.m4();
}
            fb0 = fd1 < fd0;
            fd1 = fd0 - fd1;
            fd0 = fd1 - fd0;
            fd1 = fd0 - fd1;
            if (fb1) {
                fd0 *= -1;
if(fo0 != null){
                  fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
                fb0 = fd0 < fd1;
                Thought lo0 = Thought9.getInstance(fb1, ab1, ab2, ab3);
                fd0 *= -1;
                boolean lb1 = false;
if(fo1 != null){
                  fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
                  fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
                fd0 = fd1 + fd0;
if(fo0 != null){
                  fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
                lb1 = ab1 && ab2;
if(fo1 != null){
                  fd1 = fo1.m3(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
}}}
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb1 = fd0 > fd1;
    ad1 *= -1;
    ad2 = ad3 - ad4;
    Output.points[2][4] += fd0;
    fb0 = fd1 < ad1;
    ad2 *= -1;
    Output.points[2][5] += ad3;
    boolean lb0 = true;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo0.m2();
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = !ab3;
    ab4 = ad1 < ad2;
    boolean lb0 = false;
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb0);
}
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo1.m2(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fb0 = fb1 && fb0;
    Thought lo0 = Thought5.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m1(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
    boolean lb1 = true;
    lb1 = fb0 || fb1;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb1 = fd0 < fd1;
    Thought lo2 = Thought0.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, lb1, fb0);
    fb1 = !lb1;
    fd0 *= -1;
    boolean lb3 = true;
    fd1 = fd0 - fd1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ad1 = ad2 + ad3;
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(lb0, fb0, fb1, lb0);
}
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ad1);
}
    fb0 = fb1 || lb0;
    Thought lo1 = Thought13.getInstance(fo0, fo1, ao1, ao2);
    for(int i0=0; i0<10; i0++){
        Output.points[2][6] -= ad2;
        fb0 = ad3 < ad4;
        fb1 = !lb0;
        fb0 = fb1 && lb0;
        fb0 = fd0 < fd1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
        lb0 = fb0 || fb1;
        boolean lb2 = false;
        boolean lb3 = false;
        lb2 = fd0 > fd1;
if(ao3 != null){
          ao3.m3(ad1, ad2, ad3, ad4, lb3, lb0, fb0, fb1);
}
if(ao4 != null){
          lb2 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    lb0 = fd1 > fd0;
    ab1 = ab2 && ab3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
}
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < fd0;
    fb1 = lb0 || ab1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    ab2 = fd1 < fd0;
    Output.points[2][7] -= fd1;
    ab3 = ab4 || fb0;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    if (fb1) {
if(fo1 != null){
          lb0 = fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fo0.m1(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
        double ld1 = 702.6839804023389;
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
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld0 = 859.9098487209162;
    fd0 *= -1;
    ab3 = fd1 > ld0;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
    fb0 = !fb1;
    Thought lo2 = Thought11.getInstance(ad2, ad3, ad4, fd0);
    lb1 = !ab1;
        fd1 = ld0 + ad1;
    ab2 = !ab3;
    if (ab4) {
        fb0 = ad2 > ad3;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        boolean lb3 = false;
        fb0 = ad4 > fd0;
        fd1 = ld0 + ad1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb1, lb3, lb1, ab1);
}
if(ao4 != null){
          ab2 = ao4.m2(fd1, ld0, ad1, ad2, ab3, ab4, fb0, fb1);
}
        boolean lb4 = true;
        for(int i0=0; i0<10; i0++){
            lb3 = ad3 < ad4;
            lb4 = !lb1;
            Thought lo5 = Thought4.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ad1);
            ab1 = ad2 < ad3;
if(ao3 != null){
              ad4 = ao3.m3();
}
}}
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
    fd1 *= -1;
    Output.points[2][8] -= fd0;
    Output.points[3][0] += fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
    double ld0 = 700.7790153568731;
    if (fb0) {
        fb1 = ld0 < fd0;
        } else {
        double ld1 = 70.30175665117885;
        fb0 = fb1 && fb0;
if(fo0 != null){
          fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fd1 = fo1.m3(ld1, ld0, fd0, fd1);
}
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ab2 = ab3 || ab4;
        double ld0 = 892.4286966395979;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = !ab1;
    Thought lo1 = Thought2.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 < fd1;
    fb0 = fb1 && ab1;

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
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[3][1] += ad1;
    fb1 = ad2 > ad3;
    fb0 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[3][2] -= ad1;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    boolean lb0 = true;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    boolean lb1 = true;
    for(int i0=0; i0<10; i0++){
        lb1 = fd1 < ad1;
if(fo0 != null){
          fo0.m2();
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
        ad2 *= -1;
        ad3 *= -1;
        Thought lo2 = Thought12.getInstance(fb0, fb1, lb0, lb1);
if(fo1 != null){
          ab1 = fo1.m2(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
        boolean lb3 = true;
        ab1 = !ab2;
if(fo1 != null){
          ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
        lb3 = lb0 || lb1;
        Output.points[3][3] += ad1;
        ab1 = ad2 < ad3;
        ad4 = fd0 + fd1;
        ad1 = ad2 + ad3;
        ad4 = fd0 + fd1;
        ad1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fb0 = !fb1;
    fb0 = !fb1;
    fb0 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
        double ld0 = 962.0448659347614;
        fb1 = fb0 || fb1;
        fb0 = ld0 < fd0;
        Thought lo1 = Thought8.getInstance(ao1, ao2, ao3, ao4, fd1, ld0, fd0, fd1);
        if (fb1) {
            Thought lo2 = Thought6.getInstance();
            ld0 = fd0 - fd1;
if(fo0 != null){
              fb0 = fo0.m2(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
              ld0 = ao4.m3(fb1, fb0, fb1, fb0);
}
            Thought lo3 = Thought10.getInstance(fd0, fd1, ld0, fd0);
            boolean lb4 = true;
            fd1 *= -1;
            ld0 = fd0 + fd1;
            fb0 = ld0 > fd0;
            Output.points[3][4] += fd1;
            ld0 *= -1;
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
            Thought lo5 = Thought14.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, fb1, lb4, fb0, fb1);
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
    Output.points[3][5] -= ad2;
    double ld0 = 13.336612305879724;
    fb0 = ad2 > ad3;
if(ao1 != null){
      ao1.m1(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3();
}
    fb1 = ld0 > ad1;
    ad2 = ad3 - ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fd0 < fd1;
if(ao4 != null){
      ld0 = ao4.m3(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ld0;
    fb0 = ad1 < ad2;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    double ld1 = 667.5252161513923;
    Output.points[3][6] -= ad2;
    boolean lb2 = false;
    Thought lo3 = Thought10.getInstance(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, lb2, fb0);
    Thought lo4 = Thought0.getInstance(ld0, ld1, ad1, ad2, fb1, lb2, fb0, fb1);

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
    fd1 = fd0 + fd1;
    if (ab1) {
        ab2 = !ab3;
        fd0 *= -1;
        boolean lb0 = true;
        Thought lo1 = Thought2.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
if(ao1 != null){
          fo1 = ao1.m4();
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
        fd1 = fd0 - fd1;
        lb0 = fd0 > fd1;
        double ld2 = 948.6240727705249;
        ld2 = fd0 - fd1;
        Output.points[3][7] -= ld2;
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
    boolean lb0 = false;
    ab1 = ad1 > ad2;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
if(ao4 != null){
      ao4.m1(ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    boolean lb2 = true;
    ab4 = !fb0;
    double ld3 = 319.49078566370633;
if(fo0 != null){
      ad1 = fo0.m3(fo1, ao1, ao2, ao3);
}
    fb1 = lb0 || lb1;
    double ld4 = 996.1581365247715;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, lb2, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    Thought lo5 = Thought11.getInstance(fd0, fd1, ld3, ld4, lb0, lb1, lb2, ab1);
    ab2 = !ab3;
    Thought lo6 = Thought14.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);

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
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    fb1 = fd1 > fd0;
    fb0 = fd1 > fd0;
    Output.points[3][8] -= fd1;
    boolean lb0 = true;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
    Output.points[4][0] -= fd1;
    Output.points[4][1] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought1.getInstance(fo0, fo1, fo0, fo1);
    fb1 = !lb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
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
    boolean lb0 = false;
    Output.points[4][2] += fd0;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ab4 = fo0.m2();
}
    fd1 = fd0 - fd1;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(lb1, ab1, ab2, ab3);
}
    double ld2 = 910.9110652391844;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld2, fd0);
}
    boolean lb3 = false;
    fd1 = ld2 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld2, fd0, fd1, ld2, lb0, lb1, lb3, ab1);
}
    ab2 = ab3 || ab4;
    double ld4 = 335.89934722804253;
    fb0 = ld4 > fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld2, ld4, fd0);
}
    double ld5 = 385.58795116915763;
    fd0 = fd1 - ld2;
    double ld6 = 128.52466816041874;

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
    boolean lb0 = true;
    lb0 = ad2 < ad3;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb1 = ad4 < fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
    boolean lb2 = false;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb2, lb3, fb0, fb1);
}
    ad1 *= -1;
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[4][3] -= ad1;

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
    ab2 = ad2 < ad3;
    ad4 = fd0 + fd1;
    ab3 = ab4 && fb0;
    fb1 = ad1 > ad2;
    ad3 *= -1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    fb1 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    ad2 = ad3 - ad4;
    boolean lb0 = false;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo0.m1();
}
    double ld1 = 613.1183501664683;
    ad3 *= -1;
    ad4 *= -1;
    fd0 *= -1;
    boolean lb2 = false;
    ab3 = fd1 < ld1;
    ab4 = fb0 || fb1;
    ad1 = ad2 - ad3;
    Thought lo3 = Thought0.getInstance(fo1, fo0, fo1, fo0, lb0, lb2, ab1, ab2);
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
        double ld4 = 284.8621192930527;
        ad3 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ld4);
}
        }
    Thought lo5 = Thought1.getInstance(fo1, fo0, fo1, fo0);

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
    Output.points[4][4] += fd1;
        Thought lo0 = Thought8.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    if (fb0) {
        double ld1 = 637.714095968685;
        fb1 = ld1 < fd0;
        fb0 = fb1 && fb0;
        fd1 = ld1 - fd0;
        fd1 *= -1;
        ld1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld1, fd0, fd1);
}
        } else if (fb1) {
        fb0 = fd0 < fd1;
        fb1 = fb0 || fb1;
        fd0 = fd1 + fd0;
if(ao1 != null){
          ao1.m1();
}
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
        fd1 = fd0 + fd1;
if(ao2 != null){
          ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
        Thought lo2 = Thought1.getInstance(fd0, fd1, fd0, fd1);
        fb0 = fb1 && fb0;
        double ld3 = 92.4904708473138;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    Thought lo0 = Thought15.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought6.getInstance(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
    boolean lb2 = true;
if(fo0 != null){
      ad3 = fo0.m3(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
}
if(ao4 != null){
      ao4.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb2, fb0);
}
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
    boolean lb3 = false;
if(fo0 != null){
      ad2 = fo0.m3(fb0, fb1, lb2, lb3);
}
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
    boolean lb4 = true;
    boolean lb5 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, lb4, lb5, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1, lb2, lb3, lb4, lb5);
}
    boolean lb6 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    double ld7 = 366.36522798512283;

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
    boolean lb0 = true;
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4();
}
    lb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(ao4 != null){
      lb1 = ao4.m2(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 + fd1;
        fd0 *= -1;
        fd1 *= -1;
if(ao3 != null){
          ao3.m3(fb0, fb1, lb0, lb1);
}
if(ao4 != null){
          fd0 = ao4.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
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
    ab1 = ab2 || ab3;
    Thought lo0 = Thought17.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
    ab2 = ab3 || ab4;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb1 = true;
    boolean lb2 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb1, lb2);
}
    ab1 = ad2 < ad3;
    ad4 = fd0 - fd1;
    ad1 = ad2 + ad3;
    ab2 = ab3 && ab4;
    Thought lo3 = Thought4.getInstance(ad4, fd0, fd1, ad1);

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
    double ld0 = 579.762769172636;
    fd0 = fd1 - ld0;
    fb0 = fb1 && fb0;
        fd0 *= -1;
    fd1 = ld0 + fd0;
    Output.points[4][5] -= fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
        Thought lo1 = Thought2.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb2 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb2);
}
    Output.points[4][6] -= ld0;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb2, fb0);
}
    Thought lo3 = Thought3.getInstance(fd1, ld0, fd0, fd1);
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld4 = 545.4272133240414;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld0, fb1, lb2, fb0, fb1);
}
    boolean lb5 = true;
    boolean lb6 = true;
    lb2 = ld4 > fd0;
    fd1 = ld0 - ld4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld4, lb5, lb6, fb0, fb1);
}
    lb2 = fd0 < fd1;

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
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
    fb0 = fd1 > fd0;
    double ld1 = 773.9925832439975;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0);
}
    fb1 = lb0 || fb0;
    Output.points[4][7] -= fd1;
    fb1 = ld1 < fd0;
    fd1 = ld1 - fd0;
    lb0 = fb0 && fb1;
    boolean lb2 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    lb0 = !lb2;
    Output.points[4][8] += ld1;
    fd0 = fd1 - ld1;
    Thought lo3 = Thought16.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb0, fb1, lb0, lb2);
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1, fb0, fb1, lb0, lb2);
}
    fb0 = ld1 > fd0;
    boolean lb4 = true;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    fb0 = fb1 && lb0;
    fd1 = ld1 - fd0;

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
    fd0 *= -1;
    fb1 = fd1 < fd0;
    fb0 = !fb1;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    Output.points[5][0] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        Thought lo0 = Thought9.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fd0 > fd1;
    Output.points[5][1] -= fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought0.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);

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
