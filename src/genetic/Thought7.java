package genetic;
import java.util.ArrayList;
class Thought7 extends Thought{
private static ArrayList<Thought7> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 207.16837934355956;
private double fd1 = 253.87412164355348;
private Thought fo0 = null;
private Thought fo1 = null;
Thought7 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought7 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought7 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought7 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought7 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought7 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought7 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought7 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought7 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought7 instance = new Thought7 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought7 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought7 instance = new Thought7 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought7 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought7 instance = new Thought7 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought7 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought7 instance = new Thought7 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought7 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought7 instance = new Thought7 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought7 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought7 instance = new Thought7 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought7 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought7 instance = new Thought7 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought7 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought7 instance = new Thought7 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo0.m3();
}
    fb0 = fd0 > fd1;
    boolean lb0 = true;
    fb0 = fd0 > fd1;
    fb1 = !lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
        if (lb0) {
        fb0 = !fb1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
        double ld1 = 699.710592593178;
        lb0 = ld1 > fd0;
        fb0 = fb1 || lb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        Output.points[5][2] -= fd1;
        if (fb0) {
if(fo1 != null){
              fb1 = fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
            fd0 = fd1 - ld1;
if(fo1 != null){
              fo0 = fo1.m4(fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
}
            fb1 = fd1 < ld1;
            if (lb0) {
                Thought lo2 = Thought11.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
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
    ab2 = fd0 < fd1;
    fd0 = fd1 + fd0;
    Output.points[5][3] -= fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      ab3 = fo0.m2();
}
    ab4 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m1(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ab3 = ab4 || fb0;
    fb1 = fd0 > fd1;
    Output.points[5][4] -= fd0;
        fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
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
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought2.getInstance();
    fd1 *= -1;
        if (fb0) {
        fb1 = fb0 || fb1;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
        Thought lo1 = Thought5.getInstance(ad1, ad2, ad3, ad4);
        fb1 = fd0 < fd1;
        boolean lb2 = false;
        Output.points[5][5] += ad1;
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    fd1 = ad1 - ad2;
if(fo1 != null){
          fo1.m2(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    double ld0 = 452.7101495939143;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
        fb0 = fb1 && ab1;
    ab2 = ad4 > fd0;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fb0 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          fd0 = ao1.m3();
}
        Output.points[5][6] += fd1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
        boolean lb0 = false;
if(ao2 != null){
          fb0 = ao2.m2(fb1, lb0, fb0, fb1);
}
        fd0 = fd1 - fd0;
if(ao3 != null){
          ao3.m3(fd1, fd0, fd1, fd0);
}
        Thought lo1 = Thought16.getInstance(ao4, fo0, fo1, ao1);
        lb0 = fb0 || fb1;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
        Thought lo2 = Thought17.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
if(ao1 != null){
          fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo1.m1();
}
if(ao1 != null){
          fb1 = ao1.m2(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
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
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    ad1 *= -1;
    ad2 = ad3 + ad4;
    fb0 = fd0 > fd1;
if(ao2 != null){
      ad1 = ao2.m3(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m3(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    boolean lb0 = false;
    double ld1 = 914.1254592443009;
    ad2 = ad3 + ad4;
    Thought lo2 = Thought19.getInstance(ao4, fo0, fo1, ao1);
    fb0 = !fb1;
    Thought lo3 = Thought17.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld1, ad1, lb0, fb0, fb1, lb0);
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    boolean lb4 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld1, ad1, ad2);
}
    ad3 = ad4 - fd0;

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
    ab1 = ab2 || ab3;
    fd0 *= -1;
    ab4 = !fb0;
if(ao2 != null){
      ao2.m3();
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
    fd1 *= -1;
if(ao2 != null){
      ao2.m3(ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao3.m2(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ab2 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
    ab1 = ab2 && ab3;
    boolean lb0 = true;
    boolean lb1 = false;
    ab2 = ab3 || ab4;
    Output.points[5][7] += fd1;
    double ld2 = 615.8379893133549;
    Output.points[5][8] += ld2;
    boolean lb3 = false;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld2, fd0, ab4, fb0, fb1, lb0);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld2);
}
    lb1 = !lb3;

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
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    ad2 = ad3 - ad4;
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fb1, ab1, ab2, ab3);
}
    Output.points[6][0] += fd1;
    boolean lb0 = true;
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    Thought lo1 = Thought5.getInstance(ao1, ao2, ao3, ao4);
    boolean lb2 = false;
    Thought lo3 = Thought5.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
    ad3 = ad4 + fd0;
    Output.points[6][1] -= fd1;
    Thought lo4 = Thought16.getInstance(ad1, ad2, ad3, ad4, fb1, lb0, lb2, ab1);
    fd0 = fd1 + ad1;
    ad2 *= -1;
    ab2 = ad3 < ad4;

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
    fd0 = fd1 + fd0;
    Thought lo0 = Thought4.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    boolean lb1 = true;
    double ld2 = 212.92783452392544;
    fb0 = !fb1;
    ld2 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld2, fd0, fd1, ld2);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought0.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    boolean lb1 = false;
    boolean lb2 = false;
    Thought lo3 = Thought3.getInstance(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
    double ld4 = 620.3716744658423;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld4, fd0, fd1);
}
    Output.points[6][2] += ld4;
    lb1 = fd0 < fd1;
    lb2 = ab1 || ab2;
    ld4 = fd0 - fd1;
    Thought lo5 = Thought2.getInstance();
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ld4 = fd0 - fd1;
    lb1 = ld4 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(lb2, ab1, ab2, ab3);
}
    ld4 = fd0 - fd1;
    ab4 = ld4 > fd0;
    for(int i0=0; i0<10; i0++){
        if (fb0) {
            } else if (fb1) {
            fd1 *= -1;
            lb1 = ld4 > fd0;
            Output.points[6][3] += fd1;
            ld4 = fd0 - fd1;
            boolean lb6 = true;
            boolean lb7 = false;
}}
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    double ld0 = 556.0287381582191;
    fb0 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ad1, fb1, fb0, fb1, fb0);
}
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1);
}
if(fo0 != null){
      fo0.m2();
}
    ad2 = ad3 - ad4;
    boolean lb1 = true;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(ld0, ad1, ad2, ad3);
}
    lb1 = fb0 && fb1;
    Thought lo2 = Thought13.getInstance(fo0, fo1, fo0, fo1);
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, lb1, lb3, fb0, fb1);
}
    Thought lo4 = Thought2.getInstance(ad1, ad2, ad3, ad4, lb1, lb3, fb0, fb1);
    lb1 = !lb3;
    fd0 *= -1;
    double ld5 = 763.7759920654187;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld5);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, lb3);
}
if(fo0 != null){
      fb0 = fo0.m2(ad1, ad2, ad3, ad4);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    if (ab1) {
        ad1 = ad2 - ad3;
        ad4 *= -1;
        ab2 = ab3 || ab4;
        fb0 = fd0 < fd1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
        fb1 = !ab1;
        ab2 = ad1 < ad2;
        double ld0 = 46.27398581449819;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo0.m3(fd1, ld0, ad1, ad2, ab1, ab2, ab3, ab4);
}
        ad3 *= -1;
        } else {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        ad3 = ad4 - fd0;
        fd1 = ad1 + ad2;
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
    fb1 = fb0 && fb1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(ao1 != null){
      fd1 = ao1.m3(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought8.getInstance(fd0, fd1, fd0, fd1);
    Output.points[6][4] -= fd0;
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = !fb0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought19.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = fb0 && fb1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fb0 = fb1 || fb0;
    boolean lb2 = true;
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
    boolean lb3 = true;
    fd1 = fd0 - fd1;

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
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo0 = Thought6.getInstance(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
    boolean lb1 = true;
if(fo1 != null){
      lb1 = fo1.m2(ad4, fd0, fd1, ad1, fb0, fb1, lb1, fb0);
}
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    double ld3 = 556.7031048109884;
if(ao1 != null){
      ao1.m1();
}
    boolean lb4 = false;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, lb4, fb0, fb1, lb1);
}
    lb2 = ad2 > ad3;
    lb4 = ad4 > fd0;
    boolean lb5 = false;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao3.m3(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
    fb0 = fb1 || ab1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      fd1 = ao4.m3();
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 + fd0;
    ab3 = !ab4;
    boolean lb0 = true;
    boolean lb1 = false;
    fd1 *= -1;
    Output.points[6][5] -= fd0;
    boolean lb2 = true;
if(ao4 != null){
      fd1 = ao4.m3(ab2, ab3, ab4, fb0);
}
    Thought lo3 = Thought0.getInstance(fd0, fd1, fd0, fd1);
    Thought lo4 = Thought7.getInstance(fo0, fo1, ao1, ao2);
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    boolean lb5 = true;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ab2 = ab3 && ab4;
    Output.points[6][6] -= ad2;
    ad3 *= -1;
    Thought lo0 = Thought5.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
    Thought lo1 = Thought19.getInstance(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
    Output.points[6][7] -= fd1;
            boolean lb2 = false;
    lb2 = !ab1;
    Thought lo3 = Thought13.getInstance(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
    ab2 = ab3 && ab4;
if(ao4 != null){
      ao3 = ao4.m4();
}
    fd0 = fd1 - ad1;
    ad2 *= -1;
    fb0 = !fb1;
if(fo0 != null){
      lb2 = fo0.m2(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb2, ab1);
}
    double ld4 = 573.871841562319;
    ab2 = ad2 > ad3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      ld4 = fo1.m3(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ld4;
    ad1 = ad2 - ad3;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    double ld0 = 817.5885014119586;
    ld0 *= -1;
    fb0 = fb1 || fb0;
    fd0 = fd1 - ld0;
    fd0 *= -1;
    Thought lo1 = Thought17.getInstance(fo0, fo1, fo0, fo1);
    fd1 *= -1;
    ld0 *= -1;
    boolean lb2 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb0, fb1, lb2, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, fb1, lb2, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
    fd1 = ld0 - fd0;
if(fo0 != null){
      fb1 = fo0.m2(lb2, fb0, fb1, lb2);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
    lb2 = !fb0;
    fb1 = lb2 && fb0;

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
    fd1 *= -1;
    ab1 = !ab2;
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    ab2 = fd1 > fd0;
    double ld1 = 609.3099097651984;
    boolean lb2 = true;
    fd0 = fd1 - ld1;
    boolean lb3 = true;
    boolean lb4 = false;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, lb4, ab1, ab2, ab3);
}
        Thought lo5 = Thought6.getInstance(ld1, fd0, fd1, ld1, ab4, fb0, fb1, lb0);
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
if(fo1 != null){
          ld1 = fo1.m3();
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought10.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    fb1 = fb0 && fb1;
    Thought lo1 = Thought0.getInstance(fo0, fo1, fo0, fo1);
    fd0 = fd1 - ad1;
    ad2 *= -1;
    fb0 = fb1 || fb0;
    fb1 = ad3 < ad4;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ad2 = ad3 - ad4;
    double ld0 = 866.7159377415867;
    ab1 = ad4 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          fb1 = fo0.m2();
}
    ld0 *= -1;
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = ld0 > ad1;
    ad2 = ad3 - ad4;
    fb1 = ab1 || ab2;

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
    double ld0 = 914.4867681621198;
    fb0 = ld0 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fd1, ld0, fd0, fd1);
}
    fb0 = ld0 > fd0;
    Output.points[6][8] -= fd1;
    ld0 *= -1;
    fb1 = !fb0;
    Output.points[7][0] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;

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
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    boolean lb0 = true;
    Thought lo1 = Thought16.getInstance();
    fb0 = fd0 > fd1;
    double ld2 = 463.4952508508092;
    ld2 *= -1;
    boolean lb3 = true;
    double ld4 = 956.8628993573853;
    fb0 = fb1 && lb0;
if(fo1 != null){
      lb3 = fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb3);
}
if(ao1 != null){
      ao1.m3(ld4, ad1, ad2, ad3);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    Output.points[7][1] += ad4;
    double ld5 = 693.0828977226284;
    ad4 = fd0 - fd1;
    double ld6 = 685.9374421831286;
    boolean lb7 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld2, ld4, ld5, ld6, lb7, fb0, fb1, lb0);
}
    boolean lb8 = false;
    lb3 = !lb7;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, lb8, fb0, fb1, lb0);
}
    fd0 *= -1;
    boolean lb9 = false;
if(ao3 != null){
      lb3 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ld2, ld4, ld5);
}
    Output.points[7][2] += ld6;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb7, lb8, lb9, fb0);
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
if(ao2 != null){
      ab1 = ao2.m2(ab2, ab3, ab4, fb0);
}
    double ld0 = 431.37655442997556;
    fb1 = !ab1;
    ab2 = fd0 < fd1;
if(ao3 != null){
      ao3.m2(ld0, fd0, fd1, ld0);
}
    ab3 = fd0 > fd1;
    Thought lo1 = Thought7.getInstance(ao4, fo0, fo1, ao1);
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      ab2 = ao1.m2(fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;
    fd1 = ld0 - fd0;
    Thought lo3 = Thought11.getInstance(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1);
    ld0 = fd0 - fd1;
    Thought lo4 = Thought0.getInstance();
    ld0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb2, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
    ld0 *= -1;
    double ld5 = 574.6291883710226;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, lb2, ab1);
}
    boolean lb6 = false;
if(ao3 != null){
      ao2 = ao3.m4(ld5, fd0, fd1, ld0);
}

Thought.STACK_COUNTER++;
return ld5;
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
    ab1 = ad1 > ad2;
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab4 = fb0 && fb1;
    Output.points[7][3] += ad4;
    lb0 = !ab1;
        ab2 = ab3 && ab4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb0, ab1);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    double ld0 = 376.92929798673003;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1);
}
        ld0 = fd0 - fd1;
    fb1 = ld0 < fd0;
    Thought lo1 = Thought1.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    double ld2 = 851.1875233217611;
    Output.points[7][4] -= fd0;
    boolean lb3 = false;
    double ld4 = 235.61211028148713;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, ld2, ld4);
}
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - ld0;
        fb0 = !fb1;
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
    ab1 = ab2 || ab3;
    fd1 *= -1;
if(fo1 != null){
      fo1.m2();
}
    ab4 = fb0 || fb1;
    ab1 = ab2 && ab3;
    fd0 = fd1 - fd0;
    for(int i0=0; i0<10; i0++){
        ab4 = fb0 && fb1;
        double ld0 = 483.70345691004735;
        for(int i1=0; i1<10; i1++){
if(fo0 != null){
              fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
            fd1 = ld0 - fd0;
if(fo1 != null){
              fb0 = fo1.m2(fb1, ab1, ab2, ab3);
}
}}
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
    fb1 = ad1 < ad2;
    fb0 = ad3 > ad4;
    Output.points[7][5] += fd0;
    fb1 = !fb0;
    boolean lb0 = true;
    Output.points[7][6] += fd1;
    Thought lo1 = Thought12.getInstance(ad1, ad2, ad3, ad4);
    double ld2 = 224.92757455207456;
    boolean lb3 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    ad4 *= -1;
    fd0 = fd1 + ld2;
    lb3 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb3);
}
if(fo1 != null){
          fo0 = fo1.m4(ld2, ad1, ad2, ad3, fb0, fb1, lb0, lb3);
}
    double ld4 = 830.7689417770313;
    double ld5 = 153.37632794073187;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    Output.points[7][7] -= fd1;

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
      fo0.m1(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = ab1 && ab2;
    ab3 = ad3 < ad4;
    boolean lb1 = true;
    ab3 = ab4 || fb0;
    double ld2 = 943.9130325064309;
if(fo1 != null){
      fo1.m2(fb1, lb0, lb1, ab1);
}
    boolean lb3 = false;
if(fo0 != null){
      ab1 = fo0.m2(ad4, fd0, fd1, ld2);
}
    ab2 = ad1 < ad2;
    ab3 = !ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(ld2, ad1, ad2, ad3, lb3, ab1, ab2, ab3);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld2);
}
        ab4 = fb0 && fb1;
        lb0 = lb1 && lb3;
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
    fb1 = fd1 > fd0;
    fb0 = fd1 > fd0;
    double ld0 = 240.9459667503135;
    fd0 = fd1 + ld0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Output.points[7][8] += fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld0, fd0, fd1);
}
    Output.points[8][0] += ld0;
    fb1 = fb0 && fb1;
    fd0 = fd1 + ld0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ld0 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ld0;
    fb1 = !fb0;

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
    boolean lb0 = true;
if(ao2 != null){
      ad2 = ao2.m3(fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought7.getInstance(ad3, ad4, fd0, fd1);
    Output.points[8][1] += ad1;
    fb1 = ad2 > ad3;
    Thought lo2 = Thought10.getInstance(ao3, ao4, fo0, fo1);
    ad4 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    ad3 = ad4 - fd0;
    lb0 = fb0 && fb1;
    double ld3 = 20.273956746516987;
    boolean lb4 = true;
    lb0 = lb4 && fb0;
    fd0 = fd1 + ld3;
if(ao1 != null){
      fb1 = ao1.m2(ad1, ad2, ad3, ad4, lb0, lb4, fb0, fb1);
}
    Output.points[8][2] -= fd0;
    boolean lb5 = false;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, ld3, ad1, ad2);
}
    lb0 = ad3 > ad4;
    lb4 = fd0 > fd1;
    Output.points[8][3] += ld3;
    lb5 = fb0 && fb1;
    lb0 = lb4 && lb5;
    boolean lb6 = false;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo0 = Thought11.getInstance(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
if(ao2 != null){
      fd0 = ao2.m3(fb1, ab1, ab2, ab3);
}
    Output.points[8][4] += fd1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
    Thought lo1 = Thought0.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
    fd1 = fd0 + fd1;
    Output.points[8][5] += fd0;

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
    ad2 *= -1;
    double ld0 = 719.5776605038861;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
    fd1 = ld0 + ad1;
    if (fb0) {
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
          fb1 = ao2.m2();
}
        lb1 = ab1 && ab2;
if(ao3 != null){
          ab3 = ao3.m2(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb1);
}
if(ao2 != null){
          ao2.m3(ab1, ab2, ab3, ab4);
}
        fb0 = fd1 > ld0;
if(ao3 != null){
          ao3.m2(ad1, ad2, ad3, ad4);
}
        fd0 = fd1 - ld0;
        fb1 = lb1 && ab1;
        boolean lb2 = false;
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
    boolean lb0 = true;
    lb0 = fb0 && fb1;
    boolean lb1 = true;
    lb0 = fd1 > fd0;
    boolean lb2 = true;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[8][6] += fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
}
    lb0 = !lb1;
    double ld3 = 238.41233072864625;
    fd0 *= -1;
    Output.points[8][7] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld3, fd0, fd1, ld3, lb2, fb0, fb1, lb0);
}
    fd0 = fd1 + ld3;
    lb1 = lb2 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0);
}
    double ld4 = 43.06555597203089;
    Thought lo5 = Thought18.getInstance();
    lb0 = !lb1;
    boolean lb6 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb2, lb6, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, lb2, lb6);
}
    fb0 = fb1 && lb0;
    fd0 = fd1 - ld3;
    lb1 = lb2 || lb6;
        fb0 = fb1 && lb0;
    lb1 = !lb2;

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
    fd1 *= -1;
    double ld0 = 694.8837272980171;
    Thought lo1 = Thought19.getInstance(ld0, fd0, fd1, ld0);
    fb1 = !fb0;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, lb2, fb0);
}
    fb1 = lb2 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, ld0, fd0, fd1, lb2, fb0, fb1, lb2);
}
    fb0 = !fb1;
    lb2 = ld0 > fd0;
    boolean lb3 = false;

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
    boolean lb0 = false;
    Thought lo1 = Thought14.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fb0 = fb1 || lb0;
    boolean lb2 = false;
    lb2 = fd0 < fd1;
    boolean lb3 = false;
if(fo0 != null){
      lb3 = fo0.m2();
}
        double ld4 = 91.1199381966231;
        fb0 = ld4 < fd0;
        fd1 = ld4 - fd0;
    Thought lo5 = Thought8.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, lb2, lb3);
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb2);
}
    lb3 = fd1 > ld4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld4, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = ld4 < fd0;
    Thought lo6 = Thought6.getInstance(fo0, fo1, fo0, fo1, fd1, ld4, fd0, fd1, lb0, lb2, lb3, fb0);
if(fo0 != null){
      fo0.m3(ld4, fd0, fd1, ld4, fb1, lb0, lb2, lb3);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld4, fd0);
}
    fd1 = ld4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb7 = true;

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
